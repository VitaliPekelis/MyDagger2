package com.vitali.mydagger2.scope;

import java.io.Serializable;

class Folder extends MailItem implements Serializable {

    public Folder(String name) {
        this.name = name;
    }
}