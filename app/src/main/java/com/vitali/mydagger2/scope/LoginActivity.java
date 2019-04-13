package com.vitali.mydagger2.scope;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.vitali.mydagger2.App;
import com.vitali.mydagger2.R;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity implements LoginActivityView{

    @Inject
    LoginActivityPresenter presenter;

    EditText userEditText;
    EditText passwordEditText;

    @Inject
    public void setView() {
        presenter.setView(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getComponent().createLoginComponent().injectLoginActivity(this);

        setTitle(LoginActivity.class.getSimpleName());
        setContentView(R.layout.activity_login);

        userEditText = findViewById(R.id.user);
        passwordEditText = findViewById(R.id.password);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(userEditText.getText().toString(), passwordEditText.getText().toString());
            }
        });
    }

    @Override
    public void showMailForAccount(Account account) {
        App.getInstance().createMailComponent(account);
        startActivity(new Intent(this, FolderListActivity.class));
    }


}