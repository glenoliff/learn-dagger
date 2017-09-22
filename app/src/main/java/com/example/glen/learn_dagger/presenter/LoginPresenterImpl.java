package com.example.glen.learn_dagger.presenter;

import com.example.glen.learn_dagger.service.LoginService;
import com.example.glen.learn_dagger.view.LoginView;

/**
 * Created by glen on 9/21/17.
 */
public class LoginPresenterImpl implements LoginPresenter {

    //region Instance Variables

    private LoginView mView;

    private LoginService mLoginService;

    //endregion

    public LoginPresenterImpl(LoginView view, LoginService loginService) {
        mView = view;
        mLoginService = loginService;
    }

    @Override
    public void login(String username, String password) {

        mView.clearMessage();

        if (mLoginService.login(username, password)) {
            mView.displayLoginSuccess();
        } else {
            mView.displayLoginFailure();
        }
    }
}
