package it.cctv.newmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import dagger.Component;
import dagger.internal.DaggerCollections;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class BaseActivity extends AppCompatActivity implements IView {
    @Inject
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void success(Object o) {
//        Log.e(TAG, "success: dd", );
    }

    @Override
    public void failed(String msg) {

    }
}
