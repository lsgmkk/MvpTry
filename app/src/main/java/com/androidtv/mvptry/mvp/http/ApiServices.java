package com.androidtv.mvptry.mvp.http;


import com.androidtv.mvptry.mvp.bean.LoginBean;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiServices {


    @GET("json")
    Observable<LoginBean> login();
}
