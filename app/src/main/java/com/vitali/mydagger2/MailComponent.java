package com.vitali.mydagger2;

import dagger.Subcomponent;

@Subcomponent(modules = {MailModule.class})
public interface MailComponent {

    void injectSecondActivity(SecondActivity secondActivity);
}
