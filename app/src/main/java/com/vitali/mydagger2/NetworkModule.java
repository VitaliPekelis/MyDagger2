package com.vitali.mydagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils(HttpClient httpClient) {
        return new NetworkUtils(httpClient);
    }

    @Provides
    HttpClient provideHttpClient() { return new HttpClient(); }

    @Provides SomePreferences provideSomePreferences() { return new SomePreferences(); }
}
