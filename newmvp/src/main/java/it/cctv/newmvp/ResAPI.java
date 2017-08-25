package it.cctv.newmvp;



import retrofit2.Call;

import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 创建者 by ${HanSir} on 2017/8/25.
 * 版权所有  WELLTRANS.
 * 说明       所以接口的请求路径
 */

public interface ResAPI {

    @POST(Constant.LOGINE)
    Call<BaseInfo> login(@Query("username") String username, @Query("password") String password, @Query("mobileLogin") String iftrue);
    @POST(Constant.URL_allPlan)
    Call<BaseInfo> getAllPlan(@Query("pageNo") String pageNo, @Query("pageSize") String pageSize);

}
