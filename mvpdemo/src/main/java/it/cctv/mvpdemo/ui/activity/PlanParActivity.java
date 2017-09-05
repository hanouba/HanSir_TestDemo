package it.cctv.mvpdemo.ui.activity;

import android.os.Bundle;

import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;

import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.PlanBean;
import it.cctv.mvpdemo.module.PlanParView;
import it.cctv.mvpdemo.presenter.PlanParPresenter;
import it.cctv.mvpdemo.ui.MvpActivity;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明       计划清单
 */

public class PlanParActivity extends MvpActivity<PlanParPresenter> implements PlanParView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_par);

        initData();
    }

    private void initData() {
        mvpPresenter.getPlanParData("1","30");
    }

    @Override
    public void getDataSuccess(PlanBean model) {
        int pageSize = model.getPageSize();
        AppLogMessageMgr.d("流程","PlanParActivitygetDataSuccess"+pageSize);
    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    protected PlanParPresenter createPresenter() {
        return new PlanParPresenter(this);
    }
}
