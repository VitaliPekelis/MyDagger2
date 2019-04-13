package com.vitali.mydagger2.scope;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {

    @Provides
    @Singleton
    public ApiService provideApiService() {
        Log.d("qweee", "new apiservice");
        return new ApiService();
    }
}
