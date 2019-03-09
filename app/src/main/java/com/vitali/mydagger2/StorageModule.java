package com.vitali.mydagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    //NAMED

    /*@Named(AppConstants.INJECT_NAMED_PRODUCTION)
    @Provides
    DatabaseHelper provideDatabaseHelper()
    {
        return new DatabaseHelper("app.db");
    }

    @Named(AppConstants.INJECT_NAMED_TEST)
    @Provides
    DatabaseHelper provideDatabaseHelperTest()
    {
        return new DatabaseHelper("test.db");
    }*/


    //QUALIFIER

    @AppConstants.DatabaseProd
    @Provides
    DatabaseHelper provideDatabaseHelper(){
        return new DatabaseHelper("app.db");
    }

    @AppConstants.DatabaseTest
    @Provides
    DatabaseHelper provideDatabaseHelperTest(){
        return new DatabaseHelper("test.db");
    }
}
