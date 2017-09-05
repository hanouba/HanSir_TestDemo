package it.cctv.mvpdemo.ui.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.annotation.LayoutRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.ButterKnife;
import it.cctv.mvpdemo.R;
import retrofit2.Call;
import rx.subscriptions.CompositeSubscription;

/**
 * 创建者 by ${HanSir} on 2017/8/10.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class BaseActivity extends AppCompatActivity {
    public Activity mActivity;
    private CompositeSubscription mCompositeSubscription;
    private List<Call> calls;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
        mActivity = this;
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind(this);
        mActivity = this;
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.bind(this);
        mActivity = this;
    }

    @Override
    protected void onDestroy() {
        callCancel();
        onUnsubscribe();
        super.onDestroy();
    }

    private void callCancel() {
        if (calls != null && calls.size() > 0) {
            for (Call call : calls) {
                if (!call.isCanceled())
                    call.cancel();
            }
            calls.clear();
        }
    }

    public void onUnsubscribe() {

        //取消注册，以避免内存泄露
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions())
            mCompositeSubscription.unsubscribe();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                super.onBackPressed();//返回
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public ProgressDialog progressDialog;
//    public ProgressDialog showProgressDialog() {
//        progressDialog = new ProgressDialog(mActivity);
//        progressDialog.setMessage("加载中");
//        progressDialog.show();
//        return progressDialog;
//    }

    /**
     *  自定义内容
     * @param message
     * @return
     */
//    public ProgressDialog showProgressDialog(CharSequence message) {
//        progressDialog = new ProgressDialog(mActivity);
//        progressDialog.setMessage(message);
//        progressDialog.show();
//        return progressDialog;
//    }

//    public void dismissProgressDialog() {
//        if (progressDialog != null && progressDialog.isShowing()) {
//            // progressDialog.hide();会导致android.view.WindowLeaked
//            progressDialog.dismiss();
//        }
//    }

    public void toastShow(String resId) {
        Toast.makeText(mActivity, resId, Toast.LENGTH_SHORT).show();
    }
}
