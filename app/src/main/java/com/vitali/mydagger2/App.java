package com.vitali.mydagger2;

import android.app.Activity;
import android.app.Application;

import com.vitali.mydagger2.dagger.AppComponent;
import com.vitali.mydagger2.dagger.DaggerAppComponent;
import com.vitali.mydagger2.dagger.MailComponent;
import com.vitali.mydagger2.scope.Account;
import com.vitali.mydagger2.scope.MailModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    private static AppComponent component;
    private static App instance;
    private MailComponent mailComponent;

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        component = DaggerAppComponent.create();
        component.injectApp(this);
    }

    public static App getInstance() {
        return instance;
    }

    public static AppComponent getComponent() {
        return component;
    }
    /*public static MailComponent getMailComponent() {
        return component.createMailComponent(new MailModule(new SomeObject()));
    }*/


    public void createMailComponent(Account account) {
        mailComponent = component.createMailComponent(new MailModule(account));
    }

    public MailComponent getMailComponent() {
        return mailComponent;
    }

    public void releaseMailComponent() {
        mailComponent = null;
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
