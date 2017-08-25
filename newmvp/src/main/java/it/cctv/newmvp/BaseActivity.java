package it.cctv.newmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

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

    }

    @Override
    public void failed(String msg) {

    }
}
