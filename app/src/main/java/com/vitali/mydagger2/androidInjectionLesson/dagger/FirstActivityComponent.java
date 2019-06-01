package com.vitali.mydagger2.androidInjectionLesson.dagger;

import com.vitali.mydagger2.androidInjectionLesson.AndroidInjectionLessonFirstActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = FirstActivityModule.class)
public interface FirstActivityComponent
        extends AndroidInjector<AndroidInjectionLessonFirstActivity> {

    @Subcomponent.Builder
    abstract class Builder
            extends AndroidInjector.Builder<AndroidInjectionLessonFirstActivity>{

    }
}
