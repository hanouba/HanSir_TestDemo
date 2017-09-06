package it.cctv.mvpdemo.dao.net;

/**
 * 创建者 by ${HanSir} on 2017/9/6.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class PlanParItemBean {
    public String id;
    public String createDate;
    public String updateDate;
    public String delFlag;
    public String name;
    public String beginDate;
    public String endDate;
    public String type;
    public String period;

    public PlanParItemBean(String id, String createDate, String updateDate, String delFlag, String name, String beginDate, String endDate, String type, String period) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.delFlag = delFlag;
        this.name = name;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.type = type;
        this.period = period;
    }
}
