package com.vitali.mydagger2.androidInjectionLesson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.vitali.mydagger2.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class AndroidInjectionLessonSecondActivity extends AppCompatActivity {

    @Inject
    SecondActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_injection_lesson_second);
    }
}
