package com.vitali.mydagger2.scope;

import dagger.Module;
import dagger.Provides;

@Module
public class LetterListModule {

    private Folder folder;

    public LetterListModule(Folder folder) {
        this.folder = folder;
    }

    @PerActivityScope
    @Provides
    public Folder provideFolder()
    {
        return folder;
    }

    @Provides
    public LetterListActivityPresenter provideLetterListActivityPresenter(
            MailManager mailManager,
            Folder folder)
    {
        return new LetterListActivityPresenter(mailManager, folder);
    }
}
