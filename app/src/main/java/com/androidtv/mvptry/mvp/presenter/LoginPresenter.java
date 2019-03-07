package com.androidtv.mvptry.mvp.presenter;


import com.androidtv.mvptry.mvp.bean.LoginBean;
import com.androidtv.mvptry.mvp.contract.LoginContract;

import rx.Subscriber;

public class LoginPresenter extends LoginContract.Presenter {
    @Override
    public void login(String phone, String psw) {
        register(observe(mModel.login(phone, psw))
                .subscribe(new Subscriber<LoginBean>() {
                    @Override
                    public void onCompleted() {
                        mView.netStart();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.netError(e.getMessage());
                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        mView.getLogin(loginBean);
                        mView.netEnd();
                    }
                }));
    }
}
