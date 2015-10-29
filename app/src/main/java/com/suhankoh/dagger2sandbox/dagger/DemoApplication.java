package com.suhankoh.dagger2sandbox.dagger;

import android.app.Application;

/**
 * Created by Suhan on 10/28/15.
 */
public class DemoApplication extends Application {
    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
//        mComponent = DaggerApplicationComponent.builder()
//                .applicationModule(new ApplicationModule(this))
//                .build();
    }

    public ApplicationComponent getComponent() {
        return mComponent;
    }
}
