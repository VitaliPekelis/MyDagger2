package com.vitali.mydagger2.scope;

import dagger.Subcomponent;

@PerActivityScope
@Subcomponent (modules = {FolderListActivityModule.class})
public interface FolderListActivityComponent {
    void injectFoldersListActivity(FolderListActivity activity);
}
