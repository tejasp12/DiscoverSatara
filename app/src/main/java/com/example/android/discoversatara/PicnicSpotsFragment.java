package com.example.android.discoversatara;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PicnicSpotsFragment extends Fragment {


    public PicnicSpotsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.activity_hotels,container,false);
        //Create an ArrayList of Picnic Spot.
        ArrayList<ListItem> picnicSpotList = new ArrayList<ListItem>();
        //Add picnicSpots in the list.
        picnicSpotList.add(new ListItem("Kaas Pathar/Plateau","Satara",R.drawable.kaas));
        picnicSpotList.add(new ListItem("Thoseghar Waterfall","Satara",R.drawable.toseghar));
        picnicSpotList.add(new ListItem("Sajjangad fort","Satara",R.drawable.sajjangad_fort));
        picnicSpotList.add(new ListItem("Bamnoli","Satara",R.drawable.bamnoli));
        picnicSpotList.add(new ListItem("Vasota fort","Satara",R.drawable.sajjangad_fort));
        picnicSpotList.add(new ListItem("Kaas Lake","Satara",R.drawable.bamnoli));
        picnicSpotList.add(new ListItem("Chalkewadi Wind-Mills farm","Satara",R.drawable.wind_farm));
        picnicSpotList.add(new ListItem("Vajrai Waterfall","Satara",R.drawable.toseghar));
        picnicSpotList.add(new ListItem("Satara","Satara",R.drawable.satara_city));

        //Create an ArrayAdapter for the data source.
        ListItemAdapter picnicSpotAdapter = new ListItemAdapter(getActivity(),picnicSpotList);
        //Find ListView from the view hierarchy.
        ListView hillResortListView = (ListView)rootView.findViewById(R.id.list);
        //Set adapter on the ListView.
        hillResortListView.setAdapter(picnicSpotAdapter);
        return rootView;
    }

}
