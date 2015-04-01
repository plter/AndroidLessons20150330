package com.jikexueyuan.launchlocalapp;

import android.app.Application;

/**
 * Created by plter on 3/18/15.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("oncreate app");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        System.out.println("onterminate app");
    }

}
