package it.cctv.mvpdemo.ui.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;

import java.io.File;


import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.gloable.MyApp;
import it.cctv.mvpdemo.utils.MediaUtility;
import it.cctv.mvpdemo.web.OpenFileWebChromeClient;

import static android.R.attr.permission;
import static android.os.Build.VERSION_CODES.M;
import static it.cctv.mvpdemo.gloable.MyApp.context;

public class WebActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback{
    private static final String TAG = "WebActivity";
    private static final int GET_PERMISSION_REQUEST = 101;
    private WebView webView;
    private String url = "http://192.168.14.199:8080/bpmx/weixin/index.html";
//    private String url = "http://192.168.191.1:8080/TestWork/html5/videodemo/index.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.web_view);
        initWebView();
        webView.addJavascriptInterface(new JsOperation(), "webViewObj");

        //动态获取打开文件的权限
        getPermission();
    }

    private void initWebView() {
        WebSettings settings = webView.getSettings();
        //通过浏览器打开
        webView.setWebChromeClient(mOpenFileWebChromeClient);
        //y原生界面打开
        webView.setWebViewClient(new WebViewClient());
        settings.setJavaScriptEnabled(true);
        //可缩放
        settings.setBuiltInZoomControls(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setAppCacheEnabled(true);
        settings.setBlockNetworkImage(true);
        //获取文件
        settings.setDomStorageEnabled(true);
        //js调用Android
        webView.loadUrl(url);
    }

    private void getPermission() {
        if (Build.VERSION.SDK_INT >= M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                    ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)  == PackageManager.PERMISSION_GRANTED) {
                //如果当前已经获取权限就执行下一步操作
                initWebView();
            }else {
                //没有获取权限时,获取权限
                if (MyApp.isGetPermission) {
                    //如果没有权限
                    ActivityCompat.requestPermissions(this, new String[] {
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE},GET_PERMISSION_REQUEST);
                }else {
                    //提示用户手动打开权限
                }

            }
        }
    }



    //与上面添加的对象名称一致
    class JsOperation {
        @JavascriptInterface//该注解一定要加让Javascript可以访问
        public void backHome() {
            //点击按钮后发生的事
            AppLogMessageMgr.d("流程","java调Android方法");
            System.out.println("js调用Android方法backhome");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case GET_PERMISSION_REQUEST: {
                if (grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //用户获取了权限
                    initWebView();
                }else {
                    //用户拒绝了权限 再次打开要提示用户获取权限 或者打开设置文件
                    MyApp.isGetPermission = false;
                }
            }
            break;
        }
    }

    public OpenFileWebChromeClient mOpenFileWebChromeClient = new OpenFileWebChromeClient(this);

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        Log.d(TAG,"onActivityResult");
        if (requestCode == OpenFileWebChromeClient.REQUEST_FILE_PICKER) {
            if (mOpenFileWebChromeClient.mFilePathCallback != null) {
                Uri result = intent == null || resultCode != Activity.RESULT_OK ? null
                        : intent.getData();
                if (result != null) {
                    String path = MediaUtility.getPath(getApplicationContext(),
                            result);
                    Uri uri = Uri.fromFile(new File(path));
                    mOpenFileWebChromeClient.mFilePathCallback
                            .onReceiveValue(uri);
                } else {
                    mOpenFileWebChromeClient.mFilePathCallback
                            .onReceiveValue(null);
                }
            }
            if (mOpenFileWebChromeClient.mFilePathCallbacks != null) {
                Uri result = intent == null || resultCode != Activity.RESULT_OK ? null
                        : intent.getData();
                if (result != null) {
                    String path = MediaUtility.getPath(getApplicationContext(),
                            result);
                    Uri uri = Uri.fromFile(new File(path));
                    mOpenFileWebChromeClient.mFilePathCallbacks
                            .onReceiveValue(new Uri[] { uri });
                } else {
                    mOpenFileWebChromeClient.mFilePathCallbacks
                            .onReceiveValue(null);
                }
            }

            mOpenFileWebChromeClient.mFilePathCallback = null;
            mOpenFileWebChromeClient.mFilePathCallbacks = null;
        }
    }

}
