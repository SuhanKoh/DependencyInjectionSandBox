package com.suhankoh.dagger2sandbox.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Suhan on 10/28/15.
 */
@Module
public class ApplicationModule {
    private Application mApp;

    public ApplicationModule(Application app) {
        mApp = app;
    }

    @Provides
    @Singleton
    TestLib provideTestLib() {
        return new TestLib();
    }
}