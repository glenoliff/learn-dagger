package com.example.glen.learn_dagger.di;

import com.example.glen.learn_dagger.service.LoginService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by glen on 9/22/17.
 */
@Module
public class LoginModule {

    @Provides
    LoginService provideLoginService() {
        return new LoginService();
    }
}
