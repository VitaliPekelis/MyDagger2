package com.vitali.mydagger2.scope;


import android.os.Handler;

class FolderListActivityPresenter {

    private FolderListActivityView view;
    private MailManager mailManager;

    public FolderListActivityPresenter(MailManager mailManager) {
        this.mailManager = mailManager;
    }

    public void setView(FolderListActivityView view) {
        this.view = view;
    }


    public void loadFolders() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(view != null) view.showFolders(mailManager.getFolders());
            }
        }, 1000);

    }
}
