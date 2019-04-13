package com.vitali.mydagger2.scope;

import com.vitali.mydagger2.MailRepository;


import dagger.Module;
import dagger.Provides;

@Module
public class MailModule {

    //private SomeObject mSomeObject;
    private Account mAccount;

    public MailModule(/*SomeObject someObject*/Account account) {
        /*mSomeObject=someObject;*/
        mAccount=account;
    }

    @Provides
    public MailRepository provideMailRepository()
    {
        return new MailRepository(/*mSomeObject*/);
    }

    @Provides
    @MailScope
    MailManager provideMailManager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }


    @Provides
    public Account provideAccount() {
        return mAccount;
    }
}
