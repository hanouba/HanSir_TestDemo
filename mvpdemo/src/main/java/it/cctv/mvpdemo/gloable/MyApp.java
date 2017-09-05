package it.cctv.mvpdemo.gloable;

import android.app.Application;
import android.content.Context;

import com.jingewenku.abrahamcaijin.commonutil.application.AppUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class MyApp extends Application {
    public static Context context;
    //cookie
    public static CookieJarImpl cookieJar;
    public static OkHttpClient okHttpClient;

    public Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        AppUtils.init(context);
        initCookJar();
    }

    private void initCookJar() {
        //持久化cookie
        cookieJar = new CookieJarImpl(new PersistentCookieStore(getApplicationContext()));
        okHttpClient = new OkHttpClient.Builder()
                .cookieJar(cookieJar)
                .connectTimeout(15000L, TimeUnit.MILLISECONDS)
                .readTimeout(15000L, TimeUnit.MILLISECONDS)
                .writeTimeout(15000L, TimeUnit.MILLISECONDS)
                .build();
        OkHttpUtils.initClient(okHttpClient);
    }
}
