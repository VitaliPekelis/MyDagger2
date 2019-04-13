package com.vitali.mydagger2.scope;

public class AccountManager {
    private ApiService apiService;

    public AccountManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public Account login(String user, String password) {
        return apiService.login(user, password);
    }
}
