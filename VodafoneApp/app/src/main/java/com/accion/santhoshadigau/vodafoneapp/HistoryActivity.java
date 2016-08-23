package com.accion.santhoshadigau.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by santhoshadigau on 29/07/16.
 */
public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callhistory);

        Button home;
        home=(Button)findViewById(R.id.bck);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();

            }
        });

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Relton 10:30AM Today", "10 Min 12 Sec ", "8 RS"));
        data.add(new Data("Relton 11:30AM Today", "2 Min 5 Sec ", "3 RS"));
        data.add(new Data("Relton 12:30AM Today", "4 Min 12 Sec ", "5 RS"));
        data.add(new Data("Relton 1:30AM Today", "5 Min 12 Sec ", "6 RS"));
        data.add(new Data("Relton 2:30AM Today", "5 Min 55 Sec ", "6 RS"));
        data.add(new Data("Relton 3:30AM Today", "4 Min 1 Sec ", "5 RS"));

        return data;
    }
    @Override
    public void onBackPressed() {
        HistoryActivity.this.finish();
    }
}
