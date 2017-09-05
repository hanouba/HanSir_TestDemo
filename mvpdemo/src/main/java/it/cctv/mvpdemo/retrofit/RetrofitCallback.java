package it.cctv.mvpdemo.retrofit;

import retrofit2.Call;
import retrofit2.Response;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明
 */

public abstract class RetrofitCallback<M> implements retrofit2.Callback<M> {
    public abstract void onSuccess(M model);

    public abstract void onFailure(int code, String msg);

    public abstract void onThrowable(Throwable t);

    public abstract void onFinish();

    @Override
    public void onResponse(Call<M> call, Response<M> response) {
        if (response.isSuccessful()) {
            onSuccess(response.body());
        }else {
            onFailure(response.code(),response.errorBody().toString());
        }
        onFinish();
    }

    @Override
    public void onFailure(Call<M> call, Throwable t) {
            onThrowable(t);
            onFinish();
    }
}
