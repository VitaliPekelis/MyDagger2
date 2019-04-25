package com.vitali.mydagger2.dagger;

import com.vitali.mydagger2.scope.FolderListActivityComponent;
import com.vitali.mydagger2.scope.LetterListActivityComponent;
import com.vitali.mydagger2.scope.LetterListModule;
import com.vitali.mydagger2.scope.MailModule;
import com.vitali.mydagger2.scope.MailScope;

import dagger.Subcomponent;

@MailScope
@Subcomponent(modules = {MailModule.class})
public interface MailComponent {

    /*void injectSecondActivity(SecondActivity secondActivity);*/

    FolderListActivityComponent createFolderListActivityComponent();

    LetterListActivityComponent createLatterListActivityComponent(LetterListModule letterListModule);
    //LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModel model);
}
