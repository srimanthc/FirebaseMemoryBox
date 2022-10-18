package com.example.firebasememorybox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectActionActivity extends AppCompatActivity {

    public final String TAG = "Srimanth";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_action);
    }

    public void showMemories(View view) {

    }

    public void addMemories(View view) {
        Intent intent = new Intent(SelectActionActivity.this, AddMemoryActivity.class);
        startActivity(intent);
    }

    public void logOutClicked(View view) {
        SignInActivity.firebaseHelper.logOutUser();
        Log.i(TAG, "user logged out");
        Intent intent = new Intent(SelectActionActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}

