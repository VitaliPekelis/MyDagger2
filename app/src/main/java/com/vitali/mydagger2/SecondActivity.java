package com.vitali.mydagger2;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Inject MailRepository mailRepository;
    @Inject NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getMailComponent().injectSecondActivity(this);

        setContentView(R.layout.activity_second);
        setTitle(SecondActivity.class.getSimpleName());

        Log.d("Vitali", "SecondActivity.onCreate() ");
    }
}
