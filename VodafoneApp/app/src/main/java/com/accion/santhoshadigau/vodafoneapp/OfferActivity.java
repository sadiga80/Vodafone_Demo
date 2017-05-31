package com.accion.santhoshadigau.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by santhoshadigau on 29/07/16.
 */
public class OfferActivity extends AppCompatActivity {
    BarChart chart ;
    ArrayList<BarEntry> BARENTRY ;
    ArrayList<String> BarEntryLabels ;
    BarDataSet Bardataset ;
    BarData BARDATA ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offer_activity);
        chart = (BarChart) findViewById(R.id.chart1);
        Button home;
        home=(Button)findViewById(R.id.buttonbk);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();

            }
        });


        BARENTRY = new ArrayList<>();

        BarEntryLabels = new ArrayList<String>();

        AddValuesToBARENTRY();

        AddValuesToBarEntryLabels();

        Bardataset = new BarDataSet(BARENTRY, "Voice and Data Packs");

        BARDATA = new BarData(BarEntryLabels, Bardataset);

        Bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        chart.setData(BARDATA);

        chart.animateY(3000);

    }

    public void AddValuesToBARENTRY(){

        BARENTRY.add(new BarEntry(200, 0));
        BARENTRY.add(new BarEntry(400, 1));
        BARENTRY.add(new BarEntry(600, 2));
        BARENTRY.add(new BarEntry(800, 3));
        BARENTRY.add(new BarEntry(700, 4));
        BARENTRY.add(new BarEntry(300, 5));

    }

    public void AddValuesToBarEntryLabels(){

        BarEntryLabels.add("10GB");
        BarEntryLabels.add("20GB");
        BarEntryLabels.add("30GB");
        BarEntryLabels.add("50GB");
        BarEntryLabels.add("40GB");
        BarEntryLabels.add("15GB");

    }
    @Override
    public void onBackPressed() {
        OfferActivity.this.finish();
    }
}
