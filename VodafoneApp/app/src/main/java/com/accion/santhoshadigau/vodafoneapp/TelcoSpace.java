package com.accion.santhoshadigau.vodafoneapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Ravichandra on 7/29/2016.
 */
public class TelcoSpace extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telcospace_activity);
    }
    @Override
    public void onBackPressed() {
        TelcoSpace.this.finish();
    }
}