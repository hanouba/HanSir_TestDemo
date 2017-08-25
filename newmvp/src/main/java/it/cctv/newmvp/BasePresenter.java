package it.cctv.newmvp;

import android.app.Activity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明      公共网络请求
 */

public abstract class BasePresenter {
    protected static ResAPI resAPI;
    public BasePresenter() {
        if (resAPI != null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

    }

    public class CallBackAdapter implements Callback<BaseInfo> {

        @Override
        public void onResponse(Call<BaseInfo> call, Response<BaseInfo> response) {
            if (response !=null && response.isSuccessful()) {
                BaseInfo body = response.body();
                if (body.list == null) {
                    failed("网络数据异常");
                }else {
                    paseData(body.list);
                }

            }else {
                failed("网络数据异常");
            }
        }

        @Override
        public void onFailure(Call<BaseInfo> call, Throwable t) {
            failed(t.getMessage());
        }
    }

    public abstract void paseData(String data);
    public abstract void failed(String msg);
}
