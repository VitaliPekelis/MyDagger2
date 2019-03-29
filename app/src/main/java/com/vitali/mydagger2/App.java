package com.vitali.mydagger2;

import android.app.Application;

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
    public static MailComponent getMailComponent() {
        return component.createMailComponent(new MailModule(new SomeObject()));
    }

}
