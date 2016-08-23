package com.accion.santhoshadigau.vodafoneapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ravichandra on 7/29/2016.
 */
public class MyCab extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycab_activity);
        Button home;
        home=(Button)findViewById(R.id.bbhome);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();

            }
        });

    }
    @Override
    public void onBackPressed() {
        MyCab.this.finish();
    }
}