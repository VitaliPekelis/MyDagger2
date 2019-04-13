package com.vitali.mydagger2.scope;

import java.util.List;

class MailManager {
    private Account account;
    private ApiService apiService;

    public MailManager(Account account, ApiService apiService) {
        this.account = account;
        this.apiService = apiService;
    }

    public List<Folder> getFolders() {
        return apiService.getFolders(account);
    }

    public List<Letter> getLetters(Folder folder) {
        return apiService.getLetters(folder);
    }
}
