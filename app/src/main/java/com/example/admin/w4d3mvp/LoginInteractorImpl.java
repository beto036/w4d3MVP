package com.example.admin.w4d3mvp;

/**
 * Created by admin on 11/10/2016.
 */

public class LoginInteractorImpl implements LoginInteractor{
    @Override
    public boolean login(String username, String password) {
        try {
            Thread.sleep(3000);
            if (username.equals("Beto") && password.equals("beto123"))
                return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
