package com.androidtv.mvptry.mvp.model;


import com.androidtv.mvptry.mvp.bean.LoginBean;
import com.androidtv.mvptry.mvp.contract.LoginContract;
import com.androidtv.mvptry.mvp.http.Api;

import rx.Observable;

public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<LoginBean> login(String phone, String psw) {
        return Api.getInstance().getApiSevice().login();
    }
}
