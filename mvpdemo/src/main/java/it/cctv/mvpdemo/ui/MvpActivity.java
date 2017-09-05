package it.cctv.mvpdemo.ui;

import android.os.Bundle;

import it.cctv.mvpdemo.presenter.BasePresenter;
import it.cctv.mvpdemo.ui.base.BaseActivity;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明
 */

public abstract class MvpActivity<T extends BasePresenter> extends BaseActivity {
    protected T mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);


    }
    protected abstract T createPresenter();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }

    public void showLoading() {
//        showProgressDialog();
    }
    public void hideLoading() {
//        dismissProgressDialog();
    }
}
