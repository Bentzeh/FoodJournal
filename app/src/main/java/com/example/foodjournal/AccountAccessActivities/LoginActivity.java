package com.example.foodjournal.AccountAccessActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.foodjournal.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    private void moveToRegisterActivity(View view){
        Intent i = new Intent(getBaseContext(), SignupActivity.class);
        startActivity(i);
    }
}
