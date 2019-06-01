package com.vitali.mydagger2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.vitali.mydagger2.androidInjectionLesson.AndroidInjectionLessonFirstActivity;
import com.vitali.mydagger2.castombuilders.BuildersActivity;
import com.vitali.mydagger2.dagger.DaggerUserComponent;
import com.vitali.mydagger2.dagger.UserComponent;
import com.vitali.mydagger2.dagger.asyncmodels.UserDataModule;
import com.vitali.mydagger2.scope.LoginActivity;
import com.vitali.mydagger2.utils.AndroidLogger;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

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


        fetchUser();
    }

    private void fetchUser() {
        User user = new User();
        UserComponent userComponent = DaggerUserComponent.builder().userDataModule(new UserDataModule(user)).build();
        ListenableFuture<UserData> listenableFutureUserData = userComponent.getUserData();


        Futures.addCallback(listenableFutureUserData, new FutureCallback<UserData>() {
            @Override
            public void onSuccess(@NullableDecl UserData result) {
                AndroidLogger.logDebug();
                runOnUiThread(() -> {
                    Toast.makeText(SecondActivity.this, "onSuccess", Toast.LENGTH_SHORT).show();
                    AndroidLogger.logDebug();
                });

            }

            @Override
            public void onFailure(Throwable t) {
                AndroidLogger.logDebug();
                runOnUiThread(() -> {
                    Toast.makeText(SecondActivity.this, "onFailure", Toast.LENGTH_SHORT).show();
                    AndroidLogger.logDebug();
                });

            }
        }, MoreExecutors.directExecutor());
        
    }

    public void toThirdActivity(View view) {
        startActivity(new Intent(this, BuildersActivity.class));
    }


    public void openScopeExample(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void toAndroidInjectionLessonActivity(View view) {
        startActivity(
                new Intent(this,
                        AndroidInjectionLessonFirstActivity.class));
    }
}
