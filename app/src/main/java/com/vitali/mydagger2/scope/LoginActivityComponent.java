package com.vitali.mydagger2.scope;

import dagger.Subcomponent;

@PerActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {
    void injectLoginActivity(LoginActivity activity);
}
