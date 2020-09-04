package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String PREDEFINED_USERNAME = "din_djarin";
    private static final String PREDEFINED_PASSWORD = "baby_yoda_ftw";

    private static MainActivity mainActivity;
    private TextView mLoginTitle, mUsernameLabel, mPasswordLabel;
    private EditText mUsername, mPassword;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginTitle = findViewById(R.id.loginTextView);
        mUsernameLabel = findViewById(R.id.usernameTextView);
        mPasswordLabel = findViewById(R.id.passwordTextView);
        mUsername = findViewById(R.id.usernameEditText);
        mPassword = findViewById(R.id.passwordEditText);
        mLoginButton = findViewById(R.id.loginButton);
    }

    public static Context getContext() {
        return mainActivity;
    }

    public void login(View view) {
        if (validateCredentials()) {
            Intent intent = Landing.getIntent(getApplicationContext());
            startActivity(intent);
        }
    }

    private Boolean validateCredentials() {
        String username = mUsername.getText().toString();
        String password = mPassword.getText().toString();

        Boolean isUsernameCorrect = validateUsername(username);
        Boolean isPasswordCorrect = validatePassword(password);
        setError(isUsernameCorrect, isPasswordCorrect);

        return isUsernameCorrect && isPasswordCorrect;
    }

    public boolean validateUsername(String username) {
        return username.equals(PREDEFINED_USERNAME) ? true : false;
    }

    public boolean validatePassword(String username) {
        return username.equals(PREDEFINED_PASSWORD) ? true : false;
    }

    private void setError(Boolean isUsernameCorrect, Boolean isPasswordCorrect) {
        if (!isUsernameCorrect) {
            mUsername.setError("Username incorrect");
        }
        if (!isPasswordCorrect) {
            mPassword.setError("Password incorrect");
        }
    }
}