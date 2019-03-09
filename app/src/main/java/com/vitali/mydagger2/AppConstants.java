package com.vitali.mydagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

public abstract class AppConstants {
    static final String INJECT_NAMED_PRODUCTION = "production";
    static final String INJECT_NAMED_TEST = "test";

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DatabaseTest{}

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DatabaseProd{}
}
