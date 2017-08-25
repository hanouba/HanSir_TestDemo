package it.cctv.newmvp;


import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class MainActivityPresenter extends BasePresenter {

    private static final String TAG = "MainActivityPresenter";
    IView view;

    public MainActivityPresenter(IView view) {
        this.view = view;
    }

    public void log(String username,String password) {
        Log.d(TAG, "log: username+"+username);
        Call<BaseInfo> call = resAPI.login(username,password,"true");
        call.enqueue(new CallBackAdapter());
    }

    @Override
    public void paseData(String data) {
        Gson gson = new Gson();
        Log.d(TAG,"paseData"+data);
    }

    @Override
    public void failed(String msg) {
        Log.d(TAG,msg);
        view.failed(msg);
    }
}
