package it.cctv.mvpdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;
import com.jingewenku.abrahamcaijin.commonutil.AppToastMgr;

import it.cctv.mvpdemo.MainActivity;
import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.gloable.MyApp;
import it.cctv.mvpdemo.module.activity.LoginView;
import it.cctv.mvpdemo.presenter.activity.LoginPresenter;
import it.cctv.mvpdemo.ui.MvpActivity;
import it.cctv.mvpdemo.utils.Common;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class LoginActivity extends MvpActivity<LoginPresenter> implements LoginView, View.OnClickListener {
    private EditText name,paw,ip,port;
    private Button bLogin;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText) findViewById(R.id.et_name);
        paw = (EditText) findViewById(R.id.et_paw);
        ip = (EditText) findViewById(R.id.et_ip);
        port = (EditText) findViewById(R.id.et_port);
        bLogin = (Button) findViewById(R.id.bt_login);

        initListener();
    }

    private void initListener() {
        bLogin.setOnClickListener(this);
    }

    @Override
    public void getDataSuccess(LoginBean model) {
        String user = model.getName();
        AppLogMessageMgr.d("流程","logactivity+getsuccess"+user);
        if (user != null) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else {
            AppToastMgr.shortToast(this,"sessionid失效");
        }
    }

    @Override
    public void getDataFail(String msg) {
        AppLogMessageMgr.d("流程","logactivity+getDataFail"+msg);
    }


    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login: {
                username = name.getText().toString();
                password = paw.getText().toString();
                String IP = ip.getText().toString();
                String PORT = port.getText().toString();
                Common.ip = IP;
                Common.port = PORT;
                AppLogMessageMgr.d("流程","登录"+IP+ username);
                MyApp.cookieJar.getCookieStore().removeAll();
                mvpPresenter.login(username, password);
            }
        }
    }

    @Override
    public void showLoading() {
        super.showLoading();
    }

    @Override
    public void hideLoading() {
        super.hideLoading();
    }
}
