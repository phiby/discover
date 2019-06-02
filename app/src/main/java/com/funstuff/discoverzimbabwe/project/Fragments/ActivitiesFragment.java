package com.funstuff.discoverzimbabwe.project.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.funstuff.discoverzimbabwe.project.R;
import com.funstuff.discoverzimbabwe.project.Recycler.Album;

import com.funstuff.discoverzimbabwe.project.Recycler.MyRecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by phiby on 12/05/19.
 */

public class ActivitiesFragment extends Fragment {




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_activities,null);


        RecyclerView rv = (RecyclerView) v.findViewById(R.id.mUpcoming);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getUpComingAlbum()));
        return v;
    }

    //this is were we add content to the PlaceFragment.
    //thus tis is done through the use of ArrayLists.
    private ArrayList<Album> getUpComingAlbum() {
        // Collection of activities
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("ELEPHANT BACK RIDING  : Victoria Falls", R.drawable.elephant);
        albums.add(album);

        album = new Album("CANOEING  : Victoria Falls",R.drawable.canoeing);

        albums.add(album);

        album = new Album("BUNCHY JUMPING  : Victoria Falls",R.drawable.bunchy);
        albums.add(album);

        album = new Album("WALK WITH LIONS  : Victoria Falls",R.drawable.walk);
        albums.add(album);

        album = new Album("HELICOPTTER RIDES   : Victoria Falls",R.drawable.helli);
        albums.add(album);


        album = new Album( " WHITE WATER RAFTLING   : INYANGA",R.drawable.raflting);
        albums.add(album);

        album = new Album("TURACO TRAIL HIKING   : HONDE VALLEY",R.drawable.turaco);
        albums.add(album);







        return albums;

    }

    //This is were we set title For the fragment
    public String toString(){
        return "Activities";
    }


}
