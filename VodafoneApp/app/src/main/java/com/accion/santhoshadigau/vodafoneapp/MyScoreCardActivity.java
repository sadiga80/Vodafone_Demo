package com.accion.santhoshadigau.vodafoneapp;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Ravichandra on 8/2/2016.
 */
public class MyScoreCardActivity extends AppCompatActivity {
    private int pStatus = 0;
    private TextView txtProgress,txtProgress1,txtProgress2;
    private ProgressBar progressBar,progressBar1,progressBar2;
    private Handler handler = new Handler();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.my_score_card_activity);
            txtProgress = (TextView) findViewById(R.id.txtProgress);
            txtProgress1 = (TextView) findViewById(R.id.txtProgress1);
            txtProgress2 = (TextView) findViewById(R.id.txtProgress3);
          progressBar = (ProgressBar)findViewById(R.id.progressBar);
            progressBar1 = (ProgressBar)findViewById(R.id.progressBar1);
            progressBar2 = (ProgressBar)findViewById(R.id.progressBar2);
//            ObjectAnimator animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 500); // see this max value coming back here, we animale towards that value
//            animation.setDuration (5000); //in milliseconds
//            animation.setInterpolator (new DecelerateInterpolator());
//            animation.start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (pStatus <= 100) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setProgress(pStatus);
                                txtProgress.setText(pStatus + " %");
                                progressBar1.setProgress(pStatus);
                                txtProgress1.setText(pStatus + " %");
                                progressBar2.setProgress(pStatus);
                                txtProgress2.setText(pStatus + " %");
                            }
                        });
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        pStatus++;
                    }
                }
            }).start();
}
    @Override
    public void onBackPressed() {
        MyScoreCardActivity.this.finish();
    }
}