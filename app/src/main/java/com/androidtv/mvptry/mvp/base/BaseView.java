package com.androidtv.mvptry.mvp.base;

public interface BaseView {
    void netStart();

    void netError(String msg);

    void netEnd();
}
