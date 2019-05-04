package com.vitali.mydagger2;

import androidx.annotation.IntDef;

import com.vitali.mydagger2.utils.AndroidLogger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UserData {

    private @UserType int type = NORMAL;

    public UserData() {
        AndroidLogger.logDebug();
    }

    public static UserData parsFromJson(String userDataJson) {
        //doing pars from json
        return new UserData();
    }

    public static UserData wrongUser() {
        UserData response = new UserData();
        response.setType(UserData.WRONG);
        return response ;
    }

    private void setType(@UserType int type) {
        this.type = type;
    }


    public static final int WRONG = 0, NORMAL = 1;
    @IntDef({WRONG, NORMAL})
    @Retention(RetentionPolicy.SOURCE)
    @interface UserType {}
}
