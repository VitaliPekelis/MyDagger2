package com.vitali.mydagger2;

import com.vitali.mydagger2.scope.ApiModule;
import com.vitali.mydagger2.scope.LoginActivityComponent;
import com.vitali.mydagger2.scope.MailModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, StorageModule.class, EventModule.class,
        ThreadModule.class, ApiModule.class})
public interface AppComponent {

        /*GetMethods*/
//    NetworkUtils getNetworkUtils();
//    DatabaseHelper getDatabaseHelper();

    /*InjectMethods*/
    void injectMainActivity(MainActivity mainActivity);


    //subComponent
    MailComponent createMailComponent(MailModule mailModule);

    //subComponent
    LoginActivityComponent createLoginComponent();
}
