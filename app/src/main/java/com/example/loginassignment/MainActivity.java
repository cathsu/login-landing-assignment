package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mLoginTitle, mUsernameLabel, mPasswordLabel;
    private EditText mUsername, mPassword;
    private Button mLoginButton;

    private static final String PREDEFINED_USERNAME = "din_djarin";
    private static final String PREDEFINED_PASSWORD = "baby_yoda_ftw";

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

    public void login(View view) {

    }

    private void validateCredentials() {
        String username = mUsername.getText().toString();
        String password = mPassword.getText().toString();

        Boolean isUsernameCorrect = username.equals(PREDEFINED_USERNAME) ? true : false;
        Boolean isPasswordCorrect = password.equals(PREDEFINED_PASSWORD) ? true : false;




    }


}