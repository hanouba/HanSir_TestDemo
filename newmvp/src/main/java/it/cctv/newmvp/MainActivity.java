package it.cctv.newmvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.cctv.newmvp.webview.LogWebView;

import static it.cctv.newmvp.R.id.login;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.et_pas)
    EditText etPas;
    private Button log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        log = (Button) findViewById(R.id.login);




        log.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case login:
                Toast.makeText(this,"登录",Toast.LENGTH_SHORT);
                presenter.log("admin","111111");
//                Intent intent = new Intent(this, LogWebView.class);
//                startActivity(intent);
                break;
        }
    }
}
