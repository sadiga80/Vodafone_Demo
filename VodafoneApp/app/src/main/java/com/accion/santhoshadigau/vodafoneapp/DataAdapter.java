package com.accion.santhoshadigau.vodafoneapp;

/**
 * Created by santhoshadigau on 28/07/16.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> name;
    private ArrayList<String> desi;
    private ArrayList<String> phone;

    public DataAdapter(ArrayList<String> name) {
        this.name = name;
    }


    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_country.setText(name.get(i));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_country;
        public ViewHolder(View view) {
            super(view);

            tv_country = (TextView)view.findViewById(R.id.name);
        }
    }

}
