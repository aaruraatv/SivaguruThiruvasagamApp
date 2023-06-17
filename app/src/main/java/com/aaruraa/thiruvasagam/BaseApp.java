package com.aaruraa.thiruvasagam;

import android.app.Application;
import android.os.Build;

import com.google.firebase.BuildConfig;

import timber.log.Timber;

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG)
        {
           Timber.plant(new Timber.DebugTree());
        }
    }
}
