package com.example.power.hmi;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by power on 16.12.2017.
 */

public class Controller extends Activity {


    /**
     * Place your UI with setContentView(View) in onCreate()
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // client_activity is the xml layout file.
    };
}
