package it.cctv.newmvp.webview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;

import it.cctv.newmvp.BaseActivity;
import it.cctv.newmvp.BaseInfo;
import it.cctv.newmvp.R;

/**
 * 创建者 by ${HanSir} on 2017/8/28.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class LogWebView extends BaseActivity {
    private String url = "192.168.4.199:8080/bpmx/weixin/login.html";
    private WebView logwebview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        logwebview = (WebView) findViewById(R.id.web_log);

        WebSettings settings = logwebview.getSettings();
        settings.setJavaScriptEnabled(true);

        logwebview.loadUrl(url);

    }
}
