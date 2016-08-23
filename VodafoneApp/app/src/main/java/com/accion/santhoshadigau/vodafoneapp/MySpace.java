package com.accion.santhoshadigau.vodafoneapp;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

@SuppressWarnings("deprecation")
public class MySpace extends TabActivity {

    TabHost TabHostWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myspace_activity);

        //Assign id to Tabhost.
        TabHostWindow = (TabHost)findViewById(android.R.id.tabhost);

        //Creating tab menu.
        TabSpec TabMenu1 = TabHostWindow.newTabSpec("TelcoSpace");
        TabSpec TabMenu2 = TabHostWindow.newTabSpec("PartenerSpace");



        //Setting up tab 1 name.
        TabMenu1.setIndicator("TelcoSpace");
        //Set tab 1 activity to tab 1 menu.
        TabMenu1.setContent(new Intent(this, TelcoSpace.class));

        //Setting up tab 2 name.
        TabMenu2.setIndicator("PartenerSpace");
        //Set tab 3 activity to tab 1 menu.
        TabMenu2.setContent(new Intent(this, PartenerSpace.class));



        //Adding tab1, tab2, tab3 to tabhost view.

        TabHostWindow.addTab(TabMenu1);
        TabHostWindow.addTab(TabMenu2);
        TabHostWindow.getTabWidget().setDividerDrawable(R.color.colorPrimaryDark);



    }
    @Override
    public void onBackPressed() {
        MySpace.this.finish();
    }
}