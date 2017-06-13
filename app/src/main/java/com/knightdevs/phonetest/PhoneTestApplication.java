package com.knightdevs.phonetest;

import android.app.Application;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by ashah on 13/6/17.
 */

public class PhoneTestApplication extends Application {

    public static FirebaseAnalytics mFirebaseAnalytics;
    @Override
    public void onCreate() {
        super.onCreate();
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }
}
