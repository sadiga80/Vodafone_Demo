package com.accion.santhoshadigau.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
/**
 * Created by santhoshadigau on 01/08/16.
 */
public class Location extends AppCompatActivity {
    private GoogleMap googleMap;
    double latitude = 12.971599;
    double longitude = 77.594563;
    double lat = 12.991599;
    double lon = 77.584563;
    double la = 12.981599;
    double lo = 77.574563;
    double lati = 12.961599;
    double longi = 77.564563;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycoverage_activity);
        Button home;
        home=(Button)findViewById(R.id.bbbbb);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();

            }
        });

        try {
            // Loading map
            initilizeMap();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
            MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Active Tower");
            MarkerOptions marker2 = new MarkerOptions().position(new LatLng(lat, lon)).title("Tower Down");
            MarkerOptions marker3 = new MarkerOptions().position(new LatLng(la, lo)).title("Active Tower");
            MarkerOptions marker4 = new MarkerOptions().position(new LatLng(lati, longi)).title("Tower Down");

// Changing marker icon
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
            marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2));
            marker3.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
            marker4.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2));

// adding marker
            googleMap.addMarker(marker);
            googleMap.addMarker(marker2);
            googleMap.addMarker(marker3);
            googleMap.addMarker(marker4);

            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(getApplicationContext(),
                        "Error creating Map", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        initilizeMap();
    }
    @Override
    public void onBackPressed() {
        Location.this.finish();
    }
}

