package it.cctv.mvpdemo.retrofit;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明
 */

public abstract class ApiCallBack<M> extends Subscriber<M> {
    public abstract void onSuccess(M model);

    public abstract void onFailure(String msg);

    public abstract void onFinish();

    @Override
    public void onCompleted() {

        onFinish();
    }

    @Override
    public void onError(Throwable e) {

        e.printStackTrace();
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            int code = httpException.code();
            String message = httpException.getMessage();

            if (code == 504) {
                message = "网络不给力";
            }
            if (code == 502 || code == 404) {
                message = "服务器异常,请稍后再试";
            }
            onFailure(e.getMessage());
        }
        onFinish();
    }

    @Override
    public void onNext(M model) {
        onSuccess(model);
    }
}
