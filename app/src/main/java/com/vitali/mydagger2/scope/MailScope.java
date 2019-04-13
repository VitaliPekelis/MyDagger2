package com.vitali.mydagger2.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Similar to {@link javax.inject.Singleton}
 * Identifies a type that the injector only instantiates once. Not inherited.
 *
 * Leave in Folders and letters activity
 * */
@Scope
@Retention(RUNTIME)
public @interface MailScope {
}
