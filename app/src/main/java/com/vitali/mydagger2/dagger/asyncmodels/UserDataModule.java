package com.vitali.mydagger2.dagger.asyncmodels;

import com.vitali.mydagger2.NetworkUtils;
import com.vitali.mydagger2.User;
import com.vitali.mydagger2.UserData;
import com.vitali.mydagger2.dagger.models.NetworkModule;
import com.vitali.mydagger2.utils.AndroidLogger;

import dagger.producers.ProducerModule;
import dagger.producers.Produces;

@ProducerModule(includes = NetworkModule.class)
public class UserDataModule {

    User user;

    public UserDataModule(User user) {
        this.user = user;

        AndroidLogger.logDebug();
    }

    @Produces
    UserData getUserData(NetworkUtils networkUtils)
    {
        return networkUtils.getUserData(user);
    }
}
