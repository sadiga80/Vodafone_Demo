package com.accion.santhoshadigau.vodafoneapp;

/**
 * Created by Ravichandra on 8/2/2016.
 */
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MyFitnessDetail extends TabActivity {

    TabHost TabHostWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_fitness_detail);
        Button home;
        home=(Button)findViewById(R.id.but5);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));

                finish();
            }
        });


        //Assign id to Tabhost.
        TabHostWindow = (TabHost)findViewById(android.R.id.tabhost);

        //Creating tab menu.
        TabSpec TabMenu1 = TabHostWindow.newTabSpec("My ScoreCard");
        TabSpec TabMenu2 = TabHostWindow.newTabSpec("Family Score Card");



        //Setting up tab 1 name.
        TabMenu1.setIndicator("My ScoreCard");
        //Set tab 1 activity to tab 1 menu.
        TabMenu1.setContent(new Intent(this, MyScoreCardActivity.class));

        //Setting up tab 2 name.
        TabMenu2.setIndicator("Family Score Card");
        //Set tab 3 activity to tab 1 menu.
        TabMenu2.setContent(new Intent(this, MyScoreCardActivity.class));



        //Adding tab1, tab2, tab3 to tabhost view.

        TabHostWindow.addTab(TabMenu1);
        TabHostWindow.addTab(TabMenu2);
//        TabHostWindow.getTabWidget().setDividerDrawable(R.drawable.bg);



    }
    @Override
    public void onBackPressed() {
        MyFitnessDetail.this.finish();
    }
}