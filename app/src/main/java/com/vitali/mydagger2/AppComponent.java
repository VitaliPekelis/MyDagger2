package com.vitali.mydagger2;

import dagger.Component;

@Component(modules = {NetworkModule.class, StorageModule.class})
public interface AppComponent {

        /*GetMethods*/
//    NetworkUtils getNetworkUtils();
//    DatabaseHelper getDatabaseHelper();

    /*InjectMethods*/
    void injectMainActivity(MainActivity mainActivity);



}
