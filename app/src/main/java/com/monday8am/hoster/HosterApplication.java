package com.monday8am.hoster;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by anton on 14/10/16.
 */

public abstract class HosterApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        initializeTimber ();

        // Configure defaults for Realm
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    /**
     * Initialize Timber logging
     */
    protected abstract void initializeTimber();

    public static Context getContext() {
        return context;
    }
}
