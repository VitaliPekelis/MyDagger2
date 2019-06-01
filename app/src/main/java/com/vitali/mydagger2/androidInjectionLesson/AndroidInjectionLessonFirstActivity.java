package com.vitali.mydagger2.androidInjectionLesson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.vitali.mydagger2.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class AndroidInjectionLessonFirstActivity extends AppCompatActivity {

    @Inject
    FirstActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_injection_lesson_first);
    }

    public void goToSecondActivity(View view) {
        startActivity(new Intent(this,
                AndroidInjectionLessonSecondActivity.class));
    }
}
