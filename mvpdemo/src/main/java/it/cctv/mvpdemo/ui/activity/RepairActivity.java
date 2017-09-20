package it.cctv.mvpdemo.ui.activity;


import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jingewenku.abrahamcaijin.commonutil.AppToastMgr;

import org.greenrobot.eventbus.EventBus;

import it.cctv.mvpdemo.MainActivity;
import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.module.activity.RepairView;
import it.cctv.mvpdemo.presenter.activity.RepairPresenter;
import it.cctv.mvpdemo.ui.MvpActivity;
import it.cctv.mvpdemo.utils.AudioRecordJumpUtil;

/**
 * 创建者 by ${HanSir} on 2017/9/6.
 * 版权所有  WELLTRANS.
 * 说明       报修
 */

public class RepairActivity extends MvpActivity<RepairPresenter> implements RepairView, View.OnClickListener {
    private ImageView iv_repair_select;
    private LinearLayout linearLayout;
    private ImageView takePic;
    private ImageView takeVideo;
    private ImageView takeVoic;

    private static final int REQUEST_RECORD_AUDIO = 0;
    private static final String AUDIO_FILE_PATH =
            Environment.getExternalStorageDirectory().getAbsolutePath() + "/recorded_audio.wav";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair);
        iv_repair_select = (ImageView) findViewById(R.id.iv_repair_select);
        linearLayout = (LinearLayout) findViewById(R.id.ll_function);
        takePic = (ImageView) findViewById(R.id.iv_take_pic);
        takeVideo = (ImageView) findViewById(R.id.iv_take_video);
        takeVoic = (ImageView) findViewById(R.id.iv_take_voice);
        initListener();
        EventBus.getDefault().register(this);
        System.out.println("文件夹路径"+Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    private void initListener() {
        iv_repair_select.setOnClickListener(this);
        takePic.setOnClickListener(this);
        takeVideo.setOnClickListener(this);
        takeVoic.setOnClickListener(this);
    }

    @Override
    public void getDataSuccess(LoginBean model) {

    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    protected RepairPresenter createPresenter() {
        return new RepairPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_repair_select:
                linearLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.iv_take_pic:
                AppToastMgr.shortToast(this,"获取照片");
                break;
            case R.id.iv_take_video:
                AppToastMgr.shortToast(this,"获取视频");
                break;
            case R.id.iv_take_voice:
                AppToastMgr.shortToast(this,"获取音频");
//                AudioRecordJumpUtil.startRecordAudio(RepairActivity.this);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
