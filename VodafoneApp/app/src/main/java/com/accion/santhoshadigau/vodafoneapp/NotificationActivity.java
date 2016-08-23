package com.accion.santhoshadigau.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by santhoshadigau on 28/07/16.
 */
public class NotificationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_activity);

        Button home;
        home=(Button)findViewById(R.id.pay);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), PaymentActivity.class));
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        NotificationActivity.this.finish();
    }

    }
