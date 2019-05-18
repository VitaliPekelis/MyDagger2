package com.vitali.mydagger2.castombuilders;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.vitali.mydagger2.R;
import com.vitali.mydagger2.castombuilders.dagger.BuildersExampleComponent;
import com.vitali.mydagger2.castombuilders.dagger.DaggerBuildersExampleComponent;

public class BuildersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();

        setTitle(BuildersActivity.class.getSimpleName());
        setContentView(R.layout.activity_builders);
    }

    private void inject() {
        BuildersExampleComponent component =  DaggerBuildersExampleComponent.builder()
                .methodForSettingSomeModule(new SomeObject())
                .createComponent();
    }
}
