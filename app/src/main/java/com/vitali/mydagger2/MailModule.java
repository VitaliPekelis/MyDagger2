package com.vitali.mydagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class MailModule {

    private SomeObject mSomeObject;

    public MailModule(SomeObject someObject) {
        mSomeObject=someObject;
    }

    @Provides
    public MailRepository provideMailRepository()
    {
        return new MailRepository(mSomeObject);
    }
}
