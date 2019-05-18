package com.vitali.mydagger2.castombuilders.dagger;

import com.vitali.mydagger2.castombuilders.SomeObject;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {SomeModule.class})
public interface BuildersExampleComponent {
    SomeObject getSomeObject();


    @Component.Builder
    interface MyBuilder{
         BuildersExampleComponent createComponent();

         @BindsInstance
         MyBuilder methodForSettingSomeModule(/*SomeModule someModule*/SomeObject someObject);

    }
}
