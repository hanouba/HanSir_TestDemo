package it.cctv.mvpdemo.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;

import java.util.concurrent.TimeUnit;


import it.cctv.mvpdemo.gloable.MyApp;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class ApiClient {
    public static Retrofit mRetrofit;


    public  static Retrofit  retrofit() {
        if (mRetrofit == null) {
//            OkHttpClient.Builder builder = new OkHttpClient.Builder();
//           MyApp.cookieJar = new CookieJarImpl(new PersistentCookieStore(MyApp.context));
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
//            OkHttpClient okHttpClient = builder
//                    .readTimeout(7676, TimeUnit.MILLISECONDS)
//                    .connectTimeout(7676,TimeUnit.MILLISECONDS)
//                    .cookieJar(mcookieJar)
//                    .build();
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(ApiStores.API_SERVER_URL)
                    .addConverterFactory(GsonConverterFactory.create())   // 使用Gson作为数据转换器
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())// 使用RxJava作为回调适配器
                    .client(MyApp.okHttpClient)
                    .build();
        }
        return mRetrofit;
    }
}
