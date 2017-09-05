package it.cctv.mvpdemo.retrofit;

import it.cctv.mvpdemo.dao.LoginBean;
import it.cctv.mvpdemo.dao.PlanBean;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明
 */

public interface ApiStores {
    //    http://localhost:8080/videodemo/index.html
//    http://182.106.215.227:8080/
//http://192.168.14.199:9090/VideoManagement/a/login
    String SERVER_HOST = "192.168.14.199";
    String SERVER_HOST_MOVIE = "https://api.douban.com/v2/movie/";
    int SERVER_PORT = 9090;
    String SERVER_ROOT_PATH = "/VideoManagement";
    String SERVER_BASE_PATH = SERVER_ROOT_PATH + "/a/";
    String API_SERVER_URL = "http://" + SERVER_HOST + ":" + SERVER_PORT + SERVER_BASE_PATH;
    //    String API_SERVER_URL = "http://192.168.14.199:9090/VideoManagement/a/";
    String API_SERVER_URL_SESSION = "http://" + SERVER_HOST + ":" + SERVER_PORT + SERVER_BASE_PATH+"login";

    //    登录
    @POST("login")
    Observable<LoginBean> login(@Query("username") String username, @Query("password") String password, @Query("mobileLogin") String mobileLogin);
    //   获取巡检列表
//    http://192.168.14.199:9090/VideoManagement/a/wc/mobile/plan/allList
    @POST("wc/mobile/plan/allList")
    Observable<PlanBean> getPlanPar(@Query("pageNo") String pageNo, @Query("pageSize") String pageSize);

}
