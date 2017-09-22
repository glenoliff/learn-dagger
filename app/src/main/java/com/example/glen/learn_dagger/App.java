package com.example.glen.learn_dagger;

import android.app.Application;

import com.example.glen.learn_dagger.di.AppComponent;
import com.example.glen.learn_dagger.di.AppModule;
import com.example.glen.learn_dagger.di.DaggerAppComponent;
import com.example.glen.learn_dagger.di.LoginModule;

/**
 * Created by glen on 9/22/17.
 */
public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                                          .appModule(new AppModule(this))
                                          .loginModule(new LoginModule())
                                          .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
