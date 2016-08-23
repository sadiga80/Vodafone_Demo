package com.accion.santhoshadigau.vodafoneapp;

/**
 * Created by santhoshadigau on 28/07/16.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    String [] name={"2 New Emails","1 New Email","4 New Emails","2 New Notifications","3 New Messages"};
    Context context;
    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.list, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

            Toast.makeText(context,"Recharge Item "+position,Toast.LENGTH_LONG ).show();

        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}

