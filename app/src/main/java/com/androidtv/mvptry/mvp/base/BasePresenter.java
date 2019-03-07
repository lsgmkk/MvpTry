package com.androidtv.mvptry.mvp.base;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public abstract class BasePresenter<V extends BaseView, M extends BaseModel> {
    protected V mView;
    protected M mModel;

    public RxManager mRxManager = new RxManager();

    public void setVM(V mView, M mModel) {
        this.mModel = mModel;
        this.mView = mView;
    }

    protected void register(Subscription s) {
        mRxManager.add(s);
    }

    void unregister() {
        mRxManager.clear();
    }

    protected <T> Observable<T> observe(Observable<T> observable) {
        return observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
