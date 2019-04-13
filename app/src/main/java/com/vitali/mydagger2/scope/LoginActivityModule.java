package com.vitali.mydagger2.scope;


import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @PerActivityScope
    @Provides
    AccountManager provideAccountManager(ApiService apiService) {
        return new AccountManager(apiService);
    }

    @PerActivityScope
    @Provides
    LoginActivityPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }
}
