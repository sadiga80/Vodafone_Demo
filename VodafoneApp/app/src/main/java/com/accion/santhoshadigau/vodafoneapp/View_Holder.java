package com.accion.santhoshadigau.vodafoneapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by santhoshadigau on 29/07/16.
 */
public class View_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title;
    TextView description;
    TextView imageView;

    View_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.call);
        imageView = (TextView) itemView.findViewById(R.id.price);
    }
}
