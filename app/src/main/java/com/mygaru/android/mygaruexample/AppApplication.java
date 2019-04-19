package com.mygaru.android.mygaruexample;

import android.app.Application;

import com.mygaru.android.sdk.MyGaru;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MyGaru.initialize(this, "0f80e00a0401f796b39a07e8f594c2be6496a368464cbc4d03b925eb871b1d18f2caf8cdfc093f6c16d9a4c8509374237284");

    }
}
