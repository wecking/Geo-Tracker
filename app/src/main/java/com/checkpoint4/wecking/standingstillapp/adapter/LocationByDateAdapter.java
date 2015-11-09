package com.checkpoint4.wecking.standingstillapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.checkpoint4.wecking.standingstillapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andela on 11/7/15.
 */
public class LocationByDateAdapter extends ExpandableRecyclerAdapter<LocationDateViewHolder, LocationDateChildViewHolder> {
    private LayoutInflater inflater;
    List<ParentObject> data;
    public LocationByDateAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater = LayoutInflater.from(context);
        data = parentItemList;

    }

    @Override
    public LocationDateViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.location_by_day_parent, viewGroup, false);
        LocationDateViewHolder holder = new LocationDateViewHolder(view);
        return holder;
    }

    @Override
    public LocationDateChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.location_by_day_child, viewGroup, false);
        LocationDateChildViewHolder holder = new LocationDateChildViewHolder(view);
        return holder;
    }

    @Override
    public void onBindParentViewHolder(LocationDateViewHolder locationDateViewHolder, int i, Object parentObject) {
        LocationByDate location = (LocationByDate) parentObject;
        locationDateViewHolder.date.setText(location.date);
    }

    @Override
    public void onBindChildViewHolder(LocationDateChildViewHolder locationDateChildViewHolder, int i, Object childObject) {
        ArrayList child = (ArrayList) childObject;
        LocationChildData locationChildData = (LocationChildData) child.get(0);
        locationDateChildViewHolder.lonLat.setText(locationChildData.longLat);
        locationDateChildViewHolder.timeSpent.setText(locationChildData.timeSpent);
        locationDateChildViewHolder.interval.setText(locationChildData.interval);
        locationDateChildViewHolder.address.setText(locationChildData.address);
        locationDateChildViewHolder.setTime.setText(locationChildData.setTime);
    }
}
