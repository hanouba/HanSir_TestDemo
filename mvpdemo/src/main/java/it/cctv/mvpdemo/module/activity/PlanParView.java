package it.cctv.mvpdemo.module.activity;

import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.dao.PlanBean;
import it.cctv.mvpdemo.module.BaseView;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明
 */

public interface PlanParView extends BaseView {
    /**
     * 获取数据成功
     * @param model
     */
    void getDataSuccess(PlanBean model);
    /**
     * 获取数据失败
     * @param msg
     */
    void getDataFail(String msg);
}
