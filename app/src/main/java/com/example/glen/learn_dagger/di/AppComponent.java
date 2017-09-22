package com.example.glen.learn_dagger.di;

import com.example.glen.learn_dagger.activity.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by glen on 9/22/17.
 */
@Singleton
@Component(modules={AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(LoginActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
