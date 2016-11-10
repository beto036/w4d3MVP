package com.example.admin.w4d3mvp.presenter;

import com.example.admin.w4d3mvp.LoginInteractor;
import com.example.admin.w4d3mvp.LoginInteractorImpl;
import com.example.admin.w4d3mvp.view.LoginInterface;

/**
 * Created by admin on 11/10/2016.
 */

public class LoginPresenterImpl implements LoginPresenter {

    private LoginInterface loginInterface;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginInterface loginInterface) {
        this.loginInterface = loginInterface;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public boolean validateCredentials(String username, String password) {
        if (loginInterface != null) {
            loginInterface.showProgress();
        }
        boolean valid = loginInteractor.login(username,password);

        if (loginInterface != null) {
            loginInterface.hideProgress();
            if(valid)
                loginInterface.navigateToHome();
        }

        return valid;
    }
}
