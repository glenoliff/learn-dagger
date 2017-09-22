package com.example.glen.learn_dagger.service;

import android.util.Log;

/**
 * Created by glen on 9/22/17.
 */
public class LoginService {

    public boolean login(String username, String password) {
        Log.i("LD", String.format("Logging in with: %s %s", username, password));
        return true;
    }
}
