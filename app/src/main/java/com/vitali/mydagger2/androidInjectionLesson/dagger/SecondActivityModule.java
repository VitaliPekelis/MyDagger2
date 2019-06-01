package com.vitali.mydagger2.androidInjectionLesson.dagger;

import com.vitali.mydagger2.androidInjectionLesson.SecondActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {

    @Provides
    SecondActivityPresenter provideSecondActivityPresenter() {
        return new SecondActivityPresenter();
    }

}
