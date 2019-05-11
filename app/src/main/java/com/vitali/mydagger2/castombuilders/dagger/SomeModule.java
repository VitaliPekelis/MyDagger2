package com.vitali.mydagger2.castombuilders.dagger;

import com.vitali.mydagger2.castombuilders.SomeObject;

import dagger.Module;
import dagger.Provides;

@Module
public class SomeModule {

    private final SomeObject someObject;

    public SomeModule(SomeObject someObject) {
        this.someObject = someObject;
    }

    @Provides
    SomeObject provideSomeObject()
    {
        return someObject;
    }

}
