package com.vitali.mydagger2.castombuilders.dagger;

import com.vitali.mydagger2.castombuilders.SomeObject;

import dagger.Component;

@Component(modules = {SomeModule.class})
public interface BuildersExampleComponent {
    SomeObject getSomeObject();


    @Component.Builder
    interface MyBuilder{
         BuildersExampleComponent createComponent();
         MyBuilder methodForSettingSomeModule(SomeModule someModule);

    }
}
