package com.checkpoint4.wecking.standingstillapp.adapter;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.checkpoint4.wecking.standingstillapp.R;

/**
 * Created by andela on 11/7/15.
 */
public class LocationViewHolder extends ParentViewHolder {
    TextView date;
    public LocationViewHolder(View itemView) {
        super(itemView);
        date = (TextView) itemView.findViewById(R.id.date);
    }
}
