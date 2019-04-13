package com.vitali.mydagger2.scope;

import dagger.Subcomponent;

@PerActivityScope
@Subcomponent(modules = LetterListModule.class)
public interface LetterListActivityComponent {
    void injectLettersListActivity(LetterListActivity activity);
}
