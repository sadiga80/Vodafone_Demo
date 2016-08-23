package com.accion.santhoshadigau.vodafoneapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by santhoshadigau on 29/07/16.
 */
public class ContactViewHolder extends RecyclerView.ViewHolder {
    TextView tv1;
    ImageView imageView;

    public ContactViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.phone);
        imageView= (ImageView) itemView.findViewById(R.id.ivContactImage);

    }
}
