package com.accion.santhoshadigau.vodafoneapp;

/**
 * Created by santhoshadigau on 28/07/16.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.list_title);
        imageView= (ImageView) itemView.findViewById(R.id.list_avatar);

    }
}
