package com.vitali.mydagger2;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class EventModule {

    @Provides
    @IntoSet
    EventHandler provideAnalyticsManager(){
        return new AnalyticsManager();
    }

    @Provides
    @IntoSet
    EventHandler provideMyLogger(){
        return new MyLogger();
    }
}
