package com.vitali.mydagger2.dagger.models;

import com.vitali.mydagger2.HttpClient;
import com.vitali.mydagger2.NetworkUtils;
import com.vitali.mydagger2.SomePreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Singleton
    @Provides
    NetworkUtils provideNetworkUtils(HttpClient httpClient) {
        return new NetworkUtils(httpClient);
    }

    @Provides
    HttpClient provideHttpClient() { return new HttpClient(); }

    @Singleton
    @Provides
    SomePreferences provideSomePreferences() { return new SomePreferences(); }
}
