package com.vitali.mydagger2.androidInjectionLesson.dagger;

import com.vitali.mydagger2.androidInjectionLesson.FirstActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class FirstActivityModule {

    @Provides
    FirstActivityPresenter provideFirstActivityPresenter() {
        return new FirstActivityPresenter();
    }
}
