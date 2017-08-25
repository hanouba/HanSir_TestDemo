package it.cctv.newmvp;

import dagger.Component;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明
 */
@Component(modules = PresentModule.class)
public interface ComonConponnet {
    void in(BaseActivity view);// in 的对象？  需要有@Inject的类
}
