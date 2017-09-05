package it.cctv.mvpdemo.presenter;

import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;

import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.module.LoginView;
import it.cctv.mvpdemo.retrofit.ApiCallBack;
import it.cctv.mvpdemo.ui.base.BaseActivity;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class LoginPresenter extends BasePresenter<LoginView> {

    public LoginPresenter(LoginView view) {
        attachView(view);
    }

    public void login(String name, String password) {
        mvpView.showLoading();
        addSubscription(apiStores.login(name, password,"true"), new ApiCallBack<LoginBean>() {
            @Override
            public void onSuccess(LoginBean model) {
                AppLogMessageMgr.d("流程","loginonSuccess"+model);
                mvpView.getDataSuccess(model);
            }

            @Override
            public void onFailure(String msg) {
                mvpView.getDataFail(msg);
            }
            @Override
            public void onFinish() {
                mvpView.hideLoading();
            }
        });
    }
}
