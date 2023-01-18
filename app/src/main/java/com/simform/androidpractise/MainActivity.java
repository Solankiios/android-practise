package com.simform.androidpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="hello" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: 1");

        Log.d(TAG, "onCreate: 2");

        Log.d(TAG, "onCreate: 3");

        Log.d(TAG, "onCreate: 4");

        Log.d(TAG, "onCreate: 5");
    }
}