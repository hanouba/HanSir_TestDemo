package it.cctv.mvpdemo.presenter;



import android.support.annotation.MainThread;

import io.reactivex.android.schedulers.AndroidSchedulers;
import it.cctv.mvpdemo.retrofit.ApiClient;
import it.cctv.mvpdemo.retrofit.ApiStores;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明   基类
 */

public class BasePresenter<V> {
    public V mvpView;
    protected ApiStores apiStores;
    private CompositeSubscription mCompositeSubscription;

    public void attachView(V mvpView) {
        this.mvpView = mvpView;
        apiStores = ApiClient.retrofit().create(ApiStores.class);
    }

    public void detachView() {
        this.mvpView = null;
        onUnsubscribe();
    }

    //RXjava取消注册，以避免内存泄露
    public void onUnsubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    public void addSubscription(Observable observable, Subscriber subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(subscriber));
    }
}
