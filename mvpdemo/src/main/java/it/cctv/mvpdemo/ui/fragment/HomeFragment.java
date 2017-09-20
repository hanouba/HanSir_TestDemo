package it.cctv.mvpdemo.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.gloable.MyApp;
import it.cctv.mvpdemo.module.fragment.HomeFragmentView;
import it.cctv.mvpdemo.presenter.fragment.HomeFragmentPresent;
import it.cctv.mvpdemo.ui.MvpFragment;
import it.cctv.mvpdemo.ui.activity.PlanParActivity;
import it.cctv.mvpdemo.ui.activity.RepairActivity;
import it.cctv.mvpdemo.ui.activity.TabDemoActivity;
import it.cctv.mvpdemo.ui.activity.WebActivity;
import it.cctv.mvpdemo.ui.test.TestVoiceActivity;

/**
 * 创建者 by ${HanSir} on 2017/9/6.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class HomeFragment extends MvpFragment<HomeFragmentPresent> implements HomeFragmentView, View.OnClickListener {
    private Button repair,video,insp,newTab,takeVoice;
    private Intent intent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_home, null);
        repair = (Button) inflate.findViewById(R.id.bt_repair);
        video = (Button) inflate.findViewById(R.id.bt_video);
        insp = (Button) inflate.findViewById(R.id.bt_insp);
        newTab = (Button) inflate.findViewById(R.id.bt_tab);
        takeVoice = (Button) inflate.findViewById(R.id.bt_voice_test);

        initListener();
        return inflate;
    }

    private void initListener() {
        repair.setOnClickListener(this);
        video.setOnClickListener(this);
        insp.setOnClickListener(this);
        newTab.setOnClickListener(this);
        takeVoice.setOnClickListener(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void getDataSuccess(LoginBean model) {

    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    protected HomeFragmentPresent createPresenter() {
        return new HomeFragmentPresent(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_repair:
                intent = new Intent(MyApp.context,RepairActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_video:
                intent = new Intent(MyApp.context, WebActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_insp:
              intent = new Intent(MyApp.context, PlanParActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_tab:
                intent = new Intent(MyApp.context,TabDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_voice_test:
                intent = new Intent(MyApp.context,TestVoiceActivity.class);
                startActivity(intent);
                break;
        }
    }
}
