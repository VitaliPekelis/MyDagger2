package com.vitali.mydagger2.dagger;

import com.google.common.util.concurrent.ListenableFuture;
import com.vitali.mydagger2.UserData;
import com.vitali.mydagger2.dagger.asyncmodels.UserDataModule;
import com.vitali.mydagger2.dagger.models.ExecutorModule;

import javax.inject.Singleton;

import dagger.producers.ProductionComponent;

@Singleton
@ProductionComponent(modules = {UserDataModule.class, ExecutorModule.class})
public interface UserComponent {

    ListenableFuture<UserData> getUserData();
}
