package com.vitali.mydagger2.androidInjectionLesson.dagger;

import com.vitali.mydagger2.androidInjectionLesson.AndroidInjectionLessonSecondActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = SecondActivityModule.class)
public interface SecondActivityComponent
        extends AndroidInjector<AndroidInjectionLessonSecondActivity> {

    @Subcomponent.Builder
    abstract class Builder
            extends AndroidInjector.Builder<AndroidInjectionLessonSecondActivity> {

    }
}
