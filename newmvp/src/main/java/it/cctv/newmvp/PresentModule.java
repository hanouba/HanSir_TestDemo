package it.cctv.newmvp;

import dagger.Module;
import dagger.Provides;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明
 */
@Module
public class PresentModule {
    private IView view;

    public PresentModule(IView view) {
        this.view = view;
    }

    @Provides
    public MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter(view);
    }
}
