package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Landing extends AppCompatActivity {

    private static final String TAG = "USERNAME";
    private TextView mLandingTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        mLandingTextView = findViewById(R.id.landingTextView);
        Intent intent = getIntent();
        mLandingTextView.setText("Welcome " + intent.getStringExtra(TAG));
    }

    public static Intent getIntent(Context context, String value) {
        Intent intent = new Intent(context, Landing.class);
        intent.putExtra(TAG, value);
        return intent;
    }
}