package com.vitali.mydagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, StorageModule.class, EventModule.class, ThreadModule.class})
public interface AppComponent {

        /*GetMethods*/
//    NetworkUtils getNetworkUtils();
//    DatabaseHelper getDatabaseHelper();

    /*InjectMethods*/
    void injectMainActivity(MainActivity mainActivity);


    //subComponent
    MailComponent createMailComponent(MailModule mailModule);

}
