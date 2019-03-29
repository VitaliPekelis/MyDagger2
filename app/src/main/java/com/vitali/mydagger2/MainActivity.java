package com.vitali.mydagger2;

import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;

import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //NAMED
    //-----
    /*@Named(AppConstants.INJECT_NAMED_PRODUCTION)
    @Inject
    DatabaseHelper databaseHelper;

    @Named(AppConstants.INJECT_NAMED_TEST)
    @Inject
    DatabaseHelper databaseHelperTest;*/

    //QUALIFIER
    //---------
    @AppConstants.DatabaseProd
    @Inject
    DatabaseHelper databaseHelper;

    @AppConstants.DatabaseTest
    @Inject
    DatabaseHelper databaseHelperTest;


    @Inject NetworkUtils networkUtils;
    @Inject SomePreferences preferences;

    //IntoSet
    @Inject
    Set<EventHandler> eventsHandlers;

    @Inject
    Map</*String*/ThreadModule.ThreadHandlerKey, HandlerThread> threadHandlerMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*GetMethods*/
//        databaseHelper = App.getComponent().getDatabaseHelper();
//        networkUtils = App.getComponent().getNetworkUtils();

        /*InjectMethods*/
        App.getComponent().injectMainActivity(this);

        //setContentView(R.layout.activity_main);
        startActivity(new Intent(this,SecondActivity.class));

        setTitle(MainActivity.class.getSimpleName());

    }
}
