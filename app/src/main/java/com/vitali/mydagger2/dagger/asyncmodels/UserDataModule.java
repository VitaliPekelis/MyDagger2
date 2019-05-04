package com.vitali.mydagger2.dagger.asyncmodels;

import com.vitali.mydagger2.NetworkUtils;
import com.vitali.mydagger2.User;
import com.vitali.mydagger2.UserData;
import com.vitali.mydagger2.dagger.models.NetworkModule;
import com.vitali.mydagger2.utils.AndroidLogger;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import dagger.producers.Produced;
import dagger.producers.ProducerModule;
import dagger.producers.Produces;

@ProducerModule(includes = NetworkModule.class)
public class UserDataModule {

    User user;

    public UserDataModule(User user) {
        this.user = user;

        AndroidLogger.logDebug();
    }

    /*@Produces
    UserData getUserData(NetworkUtils networkUtils)
    {
        return networkUtils.getUserDataJson(user);
    }*/

    @Produces
    String getUserDataJson(NetworkUtils networkUtils) throws IOException
    {
        AndroidLogger.logDebug();
        return networkUtils.getUserDataJson(user);
    }

    @Produces
    UserData getUserData(Produced<String> userDataJson) {
        try {
            AndroidLogger.logDebug();
            return UserData.parsFromJson(userDataJson.get());
        } catch (ExecutionException e) {
            return UserData.wrongUser();
        }

    }
}
