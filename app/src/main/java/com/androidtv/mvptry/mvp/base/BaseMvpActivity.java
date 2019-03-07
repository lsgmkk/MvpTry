package com.androidtv.mvptry.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseMvpActivity<P extends BasePresenter, M extends BaseModel> extends BaseActivity implements BaseView {

    public P mPresenter;
    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        mPresenter = getPresenter();
        mModel = getModel();
        mPresenter.setVM(this, mModel);

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.unregister();
        }
    }

    protected abstract P getPresenter();

    protected abstract M getModel();
}
