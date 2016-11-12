package com.maiml.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by maimingliang on 2016/11/12.
 */

public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

    }
}
