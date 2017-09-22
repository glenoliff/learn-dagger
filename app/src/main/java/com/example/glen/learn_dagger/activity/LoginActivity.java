package com.example.glen.learn_dagger.activity;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.glen.learn_dagger.App;
import com.example.glen.learn_dagger.R;
import com.example.glen.learn_dagger.presenter.LoginPresenter;
import com.example.glen.learn_dagger.presenter.LoginPresenterImpl;
import com.example.glen.learn_dagger.service.LoginService;
import com.example.glen.learn_dagger.view.LoginView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginView {

    //region Instance Variables

    @BindView(R.id.username) EditText mUsername;
    @BindView(R.id.password) EditText mPassword;

    @BindView(R.id.login) Button mLogin;

    @BindView(R.id.login_result) TextView mLoginResult;

    @Inject
    LoginService mLoginService;

    LoginPresenter mLoginPresenter;

    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App)getApplication()).getAppComponent().inject(this);
        mLoginPresenter = new LoginPresenterImpl(this, mLoginService);

        ButterKnife.bind(this);

        mLogin.setOnClickListener(view -> mLoginPresenter.login(mUsername.getText().toString(),
                                                                mPassword.getText().toString()));
    }

    @Override
    public void clearMessage() {
        setLoginResult(R.string.blank);
    }

    @Override
    public void displayLoginSuccess() {
        setLoginResult(R.string.login_success);
    }

    @Override
    public void displayLoginFailure() {
        setLoginResult(R.string.login_failure);
    }

    private void setLoginResult(@StringRes int msgRes) {
        mLoginResult.setText(msgRes);
    }
}
