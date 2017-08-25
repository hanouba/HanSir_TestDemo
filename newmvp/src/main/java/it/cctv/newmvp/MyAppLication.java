package it.cctv.newmvp;

import android.app.Application;
import android.content.Context;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class MyAppLication extends Application {
    private Context context;

    public Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
