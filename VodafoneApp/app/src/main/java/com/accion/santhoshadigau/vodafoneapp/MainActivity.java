package com.accion.santhoshadigau.vodafoneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton inbox;
        ImageButton address;
        ImageButton notification;
        ImageButton chat;
        ImageButton corperate;
        ImageButton offers;
        ImageButton space;
        ImageButton location;
        ImageButton net=(ImageButton)findViewById(R.id.network);
        location=(ImageButton)findViewById(R.id.locationbutton);
        space=(ImageButton)findViewById(R.id.space);
        offers=(ImageButton)findViewById(R.id.offers);
        corperate=(ImageButton)findViewById(R.id.corporate);
        chat =(ImageButton)findViewById(R.id.chat);
        notification=(ImageButton)findViewById(R.id.notify);
        address=(ImageButton)findViewById(R.id.address);
        inbox =(ImageButton)findViewById(R.id.inbox);
        inbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MessageActivity.class));


            }
        });

        address.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), ContactActivity.class));


            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), NotificationActivity.class));


            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), LiveChatActivity.class));


            }
        });
        corperate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), CorperateActivity.class));


            }
        });
        offers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), OfferActivity.class));


            }
        });
        space.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MySpace.class));


            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), Location.class));


            }
        });
        net.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), PhoneSignalStrengthActivity.class));


            }
        });
    }

}
