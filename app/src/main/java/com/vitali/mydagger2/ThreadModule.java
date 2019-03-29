package com.vitali.mydagger2;

import android.os.HandlerThread;

import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public class ThreadModule {

    @Provides
    @IntoMap
    /*@StringKey("UI")*/
    @ThreadHandlerTypeKey(ThreadHandlerKey.UI)
    public HandlerThread provideThreadHandlerUi()
    {
        return new HandlerThread("UI");
    }

    @Provides
    @IntoMap
    /*@StringKey("DB")*/
    @ThreadHandlerTypeKey(ThreadHandlerKey.DB)
    public HandlerThread provideThreadHandlerDb()
    {
        return new HandlerThread("DB");
    }

    enum ThreadHandlerKey{
        UI,DB
    }

    @MapKey
    public @interface ThreadHandlerTypeKey{
        ThreadHandlerKey value();
    }
}
