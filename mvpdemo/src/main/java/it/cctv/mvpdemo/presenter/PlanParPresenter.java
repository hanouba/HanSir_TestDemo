package it.cctv.mvpdemo.presenter;

import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;

import it.cctv.mvpdemo.dao.PlanBean;
import it.cctv.mvpdemo.module.PlanParView;
import it.cctv.mvpdemo.retrofit.ApiCallBack;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class PlanParPresenter extends BasePresenter<PlanParView> {
    public PlanParPresenter(PlanParView view) {
        attachView(view);
    }

    public void getPlanParData(String pageNO,String pageSize) {
        mvpView.showLoading();
        addSubscription(apiStores.getPlanPar(pageNO, pageSize), new ApiCallBack<PlanBean>() {
            @Override
            public void onSuccess(PlanBean model) {
                AppLogMessageMgr.d("流程","PlanParPresenter+onSuccess"+model);
                mvpView.getDataSuccess(model);
            }

            @Override
            public void onFailure(String msg) {
                AppLogMessageMgr.d("流程","PlanParPresenter+onFailure"+msg);
                mvpView.getDataFail(msg);
            }

            @Override
            public void onFinish() {
                mvpView.hideLoading();
            }
        });
    }
}
