package it.cctv.mvpdemo.module;


import it.cctv.mvpdemo.dao.LoginBean;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明   首页
 */

public interface LoginView extends BaseView {
    /**
     * 获取数据成功
     * @param model
     */
    void getDataSuccess(LoginBean model);
    /**
     * 获取数据失败
     * @param msg
     */
    void getDataFail(String msg);
}
