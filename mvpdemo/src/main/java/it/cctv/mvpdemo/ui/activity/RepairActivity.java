package it.cctv.mvpdemo.ui.activity;

import android.os.Bundle;

import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.module.activity.RepairView;
import it.cctv.mvpdemo.presenter.activity.RepairPresenter;
import it.cctv.mvpdemo.ui.MvpActivity;

/**
 * 创建者 by ${HanSir} on 2017/9/6.
 * 版权所有  WELLTRANS.
 * 说明       报修
 */

public class RepairActivity extends MvpActivity<RepairPresenter> implements RepairView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair);
    }

    @Override
    public void getDataSuccess(LoginBean model) {

    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    protected RepairPresenter createPresenter() {
        return new RepairPresenter(this);
    }
}
