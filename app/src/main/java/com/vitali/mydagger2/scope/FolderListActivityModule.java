package com.vitali.mydagger2.scope;

import dagger.Module;
import dagger.Provides;

@Module
public class FolderListActivityModule {

    @PerActivityScope
    @Provides
    public FolderListActivityPresenter provideFoldersListActivityPresenter(MailManager mailManager){
        return new FolderListActivityPresenter(mailManager);
    }
}
