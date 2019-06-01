package com.vitali.mydagger2.androidInjectionLesson.dagger;

import com.vitali.mydagger2.androidInjectionLesson.AndroidInjectionLessonFirstActivity;
import com.vitali.mydagger2.androidInjectionLesson.AndroidInjectionLessonSecondActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {FirstActivityComponent.class, SecondActivityComponent.class})
public abstract class AbsBuildersModule {

    @Binds
    @IntoMap
    @ClassKey(AndroidInjectionLessonFirstActivity.class)
    abstract AndroidInjector.Factory<?>
    bindFirstActivityInjectorFactory(FirstActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ClassKey(AndroidInjectionLessonSecondActivity.class)
    abstract AndroidInjector.Factory<?>
    bindSecondActivityInjectorFactory(SecondActivityComponent.Builder builder);
}
