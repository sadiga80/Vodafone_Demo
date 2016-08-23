package com.accion.santhoshadigau.vodafoneapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by santhoshadigau on 29/07/16.
 */
public class ContactAdapter extends  RecyclerView.Adapter<ContactViewHolder> {
    String [] name={"Relton     (98465378234)","Santhosh     (9786453267)","Manoj     (8974563245)","Naveen     (7563467236)"};
    Context context;
    LayoutInflater inflater;
    public ContactAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.single_contact_view, parent, false);

        ContactViewHolder viewHolder=new ContactViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ContactViewHolder vholder = (ContactViewHolder) v.getTag();
            int position = vholder.getPosition();
            context.startActivity(new Intent(v.getContext(), HistoryActivity.class));



        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
