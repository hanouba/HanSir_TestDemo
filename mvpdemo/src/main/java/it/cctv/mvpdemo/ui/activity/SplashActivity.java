package it.cctv.mvpdemo.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.cctv.mvpdemo.MainActivity;
import it.cctv.mvpdemo.R;

//闪屏界面
public class SplashActivity extends AppCompatActivity {
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent  = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        },3000);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
