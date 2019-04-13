package com.vitali.mydagger2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.vitali.mydagger2.scope.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    /*@Inject MailRepository mailRepository;
    @Inject NetworkUtils networkUtils;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //App.getInstance().getMailComponent().injectSecondActivity(this);

        setContentView(R.layout.activity_second);
        setTitle(SecondActivity.class.getSimpleName());

        Log.d("Vitali", "SecondActivity.onCreate() ");
    }

    public void openScopeExample(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
