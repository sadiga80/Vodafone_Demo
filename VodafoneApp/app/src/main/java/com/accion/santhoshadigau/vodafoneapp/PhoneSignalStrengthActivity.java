package com.accion.santhoshadigau.vodafoneapp;

/**
 * Created by santhoshadigau on 01/08/16.
 */
import pl.pawelkleczkowski.customgauge.CustomGauge;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhoneSignalStrengthActivity extends Activity {
    final String TAG = "PhoneSignalStrengthActivity";
    private CustomGauge gauge1;

    SignalStrengthListener mListener;


    TextView tv;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_network);
        gauge1 = (CustomGauge) findViewById(R.id.gauge1);
        tv=(TextView)findViewById(R.id.netvalue);

        Button home;
        home=(Button)findViewById(R.id.button3);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();

            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();

        mListener = new SignalStrengthListener();
        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//		tm.listen(mListener, PhoneStateListener.LISTEN_SIGNAL_STRENGTH);
//		tm.listen(mListener, PhoneStateListener.LISTEN_SIGNAL_STRENGTH|PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);
        tm.listen(mListener, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);

    }

    @Override
    protected void onPause() {
        super.onPause();

        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        tm.listen(mListener, PhoneStateListener.LISTEN_NONE);	// LISTEN_NONE : Stop listening for updates.
    }


    public class SignalStrengthListener extends PhoneStateListener {

//		@Override
//		public void onSignalStrengthChanged(int asu) {
//			String str = asu + "/"+String.valueOf(-113+2*asu)+"dBm";
//			editTextLog.append(str+"\n");
//			Log.v(TAG,"asu="+str);
//		}

        @Override
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);

            boolean	isGsm = signalStrength.isGsm();
            // Get the CDMA RSSI value in dBm
            int	iCdmaDbm = signalStrength.getCdmaDbm();
            // Get the CDMA Ec/Io value in dB*10
            int	iCdmaEcio = signalStrength.getCdmaEcio();
            // Get the EVDO RSSI value in dBm
            int	iEvdoDbm = signalStrength.getEvdoDbm();
            // Get the EVDO Ec/Io value in dB*10
            int	iEvdoEcio = signalStrength.getEvdoEcio();
            // Get the signal to noise ratio. Valid values are 0-8. 8 is the highest.
            int	iEvdoSnr = signalStrength.getEvdoSnr();
            // Get the GSM bit error rate (0-7, 99) as defined in TS 27.007 8.5
            int	iGsmBitErrorRate = signalStrength.getGsmBitErrorRate();
            // Get the GSM Signal Strength, valid values are (0-31, 99) as defined in TS 27.007 8.5
            int	iGsmSignalStrength = signalStrength.getGsmSignalStrength();

            String str =
                    "GSM Signal Strength="+iGsmSignalStrength

                    +"\n";
            gauge1.setValue(+iGsmSignalStrength);
            tv.setText(Integer.toString(+iCdmaDbm)+"dBm");



        }
    }
    @Override
    public void onBackPressed() {
        PhoneSignalStrengthActivity.this.finish();
    }
}
