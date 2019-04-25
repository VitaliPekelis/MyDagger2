package com.vitali.mydagger2.dagger.models;

import com.vitali.mydagger2.AnalyticsManager;
import com.vitali.mydagger2.EventHandler;
import com.vitali.mydagger2.MyLogger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;

@Module
public class EventModule {


    //IntoSet
    //--------
    /*@Provides
    @IntoSet
    EventHandler provideAnalyticsManager(){
        return new AnalyticsManager();
    }

    @Provides
    @IntoSet
    EventHandler provideMyLogger(){
        return new MyLogger();
    }*/


    //ElementsIntoSet
    //--------
    @Provides
    @ElementsIntoSet
    Set<EventHandler> provideEventHandlers(){
        return new HashSet<>(Arrays.asList(new AnalyticsManager(), new MyLogger()));
    }
}
