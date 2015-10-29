package com.suhankoh.dagger2sandbox.dagger;

import com.suhankoh.dagger2sandbox.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Suhan on 10/28/15.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity activity);
}