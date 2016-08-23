package com.accion.santhoshadigau.vodafoneapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by santhoshadigau on 28/07/16.
 */
public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_activity);
        Button home;
        home=(Button)findViewById(R.id.homebackhome);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();

            }
        });

        ImageButton mpesa;
        mpesa=(ImageButton)findViewById(R.id.mpesa);
        mpesa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

        ImageButton paypal;
        paypal=(ImageButton)findViewById(R.id.paytm);
        paypal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

        ImageButton credit;
        credit=(ImageButton)findViewById(R.id.creditcard);
        credit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

        ImageButton payu;
        payu=(ImageButton)findViewById(R.id.payu);
        payu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

        ImageButton america;
        america=(ImageButton)findViewById(R.id.aexpress);
        america.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

        ImageButton netb;
        netb=(ImageButton)findViewById(R.id.netbanking);
        netb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });
        ImageButton mcard;
        mcard=(ImageButton)findViewById(R.id.master);
        mcard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

        ImageButton bcoin;
        bcoin=(ImageButton)findViewById(R.id.bcoin);
        bcoin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                alertMessage();
            }
        });

    }




    public void alertMessage() {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        // Yes button clicked
                        Toast.makeText(PaymentActivity.this, "Congragulations, Payment successful",
                                Toast.LENGTH_LONG).show();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        // No button clicked
                        // do nothing
                        Toast.makeText(PaymentActivity.this, "Payment couldn,t be processed",
                                Toast.LENGTH_LONG).show();
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm Payment of 820.00 RS?")
                .setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();





    }
    @Override
    public void onBackPressed() {
        PaymentActivity.this.finish();
    }
}

