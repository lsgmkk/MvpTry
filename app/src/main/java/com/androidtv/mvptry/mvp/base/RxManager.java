package com.androidtv.mvptry.mvp.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class RxManager {
    CompositeSubscription mSubscription;

    public RxManager() {
        mSubscription = new CompositeSubscription();
    }

    public void add(Subscription s) {
        mSubscription.add(s);
    }

    public void clear() {
        mSubscription.clear();
    }

}
