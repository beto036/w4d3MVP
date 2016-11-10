package com.example.admin.w4d3mvp.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.admin.w4d3mvp.R;
import com.example.admin.w4d3mvp.presenter.LoginPresenter;
import com.example.admin.w4d3mvp.presenter.LoginPresenterImpl;

public class MainActivity extends AppCompatActivity implements LoginInterface{


    private static final String TAG = "MainActivityTAG_";
    private EditText username;
    private EditText password;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.aMainTxtUser);
        password = (EditText) findViewById(R.id.aMainTxtPass);

        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        Log.d(TAG, "showProgress: ");
    }

    @Override
    public void hideProgress() {
        Log.d(TAG, "hideProgress: ");
    }

    @Override
    public void navigateToHome() {
        Log.d(TAG, "navigateToHome: ");
    }

    public void login(View view) {
        if(loginPresenter.validateCredentials(username.getText().toString(), password.getText().toString()))
            Log.d(TAG, "login: User valid");
        else
            Log.d(TAG, "login: User invalid");
    }
}
