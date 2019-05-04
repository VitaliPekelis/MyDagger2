package com.vitali.mydagger2;


import android.text.format.DateUtils;

import com.vitali.mydagger2.utils.AndroidLogger;

public class NetworkUtils {

    public NetworkUtils(HttpClient httpClient) {
    }


    public UserData getUserData(User user) {
        AndroidLogger.logDebug();
        try {
            Thread.sleep(DateUtils.SECOND_IN_MILLIS * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new UserData();
    }

    public String getUserDataJson(User user) {

        AndroidLogger.logDebug();
        try {
            Thread.sleep(DateUtils.SECOND_IN_MILLIS * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
