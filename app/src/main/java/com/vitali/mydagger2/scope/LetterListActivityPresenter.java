package com.vitali.mydagger2.scope;

import android.os.Handler;

public class LetterListActivityPresenter {

    private LetterListActivityView view;
    private MailManager mailManager;
    private Folder folder;

    public LetterListActivityPresenter(MailManager mailManager, Folder folder) {
        this.folder = folder;
        this.mailManager = mailManager;
    }

    public void setView(LetterListActivityView view) {
        this.view = view;
    }

    public void loadLetters() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(view != null) view.showLetters(mailManager.getLetters(folder));
            }
        }, 1000);
    }
}
