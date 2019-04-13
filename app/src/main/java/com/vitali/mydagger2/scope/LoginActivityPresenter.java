package com.vitali.mydagger2.scope;

class LoginActivityPresenter{

    private LoginActivityView view;
    private AccountManager accountManager;

    public LoginActivityPresenter(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void setView(LoginActivityView view) {
        this.view = view;
    }

    void login(String user, String password) {
        Account account = accountManager.login(user, password);
        view.showMailForAccount(account);
    }
}
