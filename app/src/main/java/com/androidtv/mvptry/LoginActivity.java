package com.androidtv.mvptry;

import android.view.View;

import com.androidtv.mvptry.mvp.base.BaseMvpActivity;
import com.androidtv.mvptry.mvp.bean.LoginBean;
import com.androidtv.mvptry.mvp.contract.LoginContract;
import com.androidtv.mvptry.mvp.model.LoginModel;
import com.androidtv.mvptry.mvp.presenter.LoginPresenter;

public class LoginActivity extends BaseMvpActivity<LoginPresenter, LoginModel> implements LoginContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected LoginModel getModel() {
        return new LoginModel();
    }

    @Override
    protected void initDate() {

    }

    @Override
    protected void initView() {
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login("", "");
            }
        });
    }

    @Override
    public void netStart() {

    }

    @Override
    public void netError(String msg) {

    }

    @Override
    public void netEnd() {

    }

    @Override
    public void getLogin(LoginBean loginBean) {

    }
}
