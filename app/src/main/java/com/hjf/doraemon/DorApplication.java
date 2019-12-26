package com.hjf.doraemon;

import android.app.Application;

import com.didichuxing.doraemonkit.DoraemonKit;

/**
 * @author heJianfeng
 * @date 2019-12-26
 */
public class DorApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DoraemonKit.install(this);
    }
}
