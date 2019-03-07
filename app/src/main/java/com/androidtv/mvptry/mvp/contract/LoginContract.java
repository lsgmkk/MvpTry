package com.androidtv.mvptry.mvp.contract;


import com.androidtv.mvptry.mvp.base.BaseModel;
import com.androidtv.mvptry.mvp.base.BasePresenter;
import com.androidtv.mvptry.mvp.base.BaseView;
import com.androidtv.mvptry.mvp.bean.LoginBean;

import rx.Observable;

public interface LoginContract {
    interface View extends BaseView {
        void getLogin(LoginBean loginBean);
    }

    interface Model extends BaseModel {
        Observable<LoginBean> login(String phone, String psw);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        public abstract void login(String phone, String psw);
    }
}
