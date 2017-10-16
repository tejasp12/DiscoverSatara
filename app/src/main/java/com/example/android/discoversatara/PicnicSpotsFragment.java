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
        //Toast.makeText(getTargetFragment(),"Explore Picnic Spots",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);
        //Create an ArrayList of Picnic Spot.
        ArrayList<ListItem> picnicSpotList = new ArrayList<ListItem>();
        //Add picnicSpots in the list.
        picnicSpotList.add(new ListItem(KAAS_PATHAR_PLATEAU, SATARA, R.drawable.kaas));
        picnicSpotList.add(new ListItem(THOSEGHAR_WATERFALL, SATARA, R.drawable.toseghar));
        picnicSpotList.add(new ListItem(SAJJANGAD_FORT, SATARA, R.drawable.sajjangad_fort));
        picnicSpotList.add(new ListItem(BAMNOLI, SATARA, R.drawable.bamnoli));
        picnicSpotList.add(new ListItem(VASOTA_FORT, SATARA, R.drawable.sajjangad_fort));
        picnicSpotList.add(new ListItem(KAAS_LAKE, SATARA, R.drawable.bamnoli));
        picnicSpotList.add(new ListItem(CHALKEWADI_WIND_MILLS_FARM, SATARA, R.drawable.wind_farm));
        picnicSpotList.add(new ListItem(VAJRAI_WATERFALL, SATARA, R.drawable.toseghar));
        picnicSpotList.add(new ListItem(SATARA, SATARA, R.drawable.satara_city));

        //Create an ArrayAdapter for the data source.
        ListItemAdapter picnicSpotAdapter = new ListItemAdapter(getActivity(), picnicSpotList,
                R.color.category_picnic_spots);
        //Find ListView from the view hierarchy.
        ListView hillResortListView = (ListView) rootView.findViewById(R.id.list);
        //Set adapter on the ListView.
        hillResortListView.setAdapter(picnicSpotAdapter);
        return rootView;
    }

}
