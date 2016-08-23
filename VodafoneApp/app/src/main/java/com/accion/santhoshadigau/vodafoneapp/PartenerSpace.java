package com.accion.santhoshadigau.vodafoneapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ravichandra on 7/29/2016.
 */
public class PartenerSpace  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.partnerspace_activity);
        Button btmycab=(Button)findViewById(R.id.bt_mycab);
        Button home;
        home=(Button)findViewById(R.id.bbbck);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));


            }
        });

        btmycab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(PartenerSpace.this,MyCab.class);
                startActivity(in);
            }
        });
        Button myfit=(Button)findViewById(R.id.fit);
        myfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartenerSpace.this,MyFitnessDetail.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        PartenerSpace.this.finish();
    }
}