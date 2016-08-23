package com.accion.santhoshadigau.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by santhoshadigau on 29/07/16.
 */
public class ContactActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);





        Button home;
        home=(Button)findViewById(R.id.bck);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();


            }
        });

        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);

        ContactAdapter adapter=new ContactAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public void onBackPressed() {
        ContactActivity.this.finish();
    }





}
