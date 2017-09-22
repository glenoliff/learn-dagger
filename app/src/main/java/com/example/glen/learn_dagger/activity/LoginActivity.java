package com.example.glen.learn_dagger.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.glen.learn_dagger.R;
import com.example.glen.learn_dagger.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
