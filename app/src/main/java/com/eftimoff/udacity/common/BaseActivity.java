package com.eftimoff.udacity.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by georgieftimov on 06/04/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFields();
    }

    protected abstract void initFields();
}
