package com.funstuff.discoverzimbabwe.project.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.funstuff.discoverzimbabwe.project.R;

/**
 * Created by phiby on 24/05/19.
 */


// this is where we state what type of data should be displayed by the fragments
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView img;
    TextView place;
    ItemClickListener itemClickListener;

    public MyViewHolder(View itemView) {
        super(itemView);
        place=(TextView) itemView.findViewById(R.id.place);
        img = (ImageView) itemView.findViewById(R.id.movieImage);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }
}
