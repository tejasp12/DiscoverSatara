package com.example.android.discoversatara;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HillResortsFragment extends Fragment {

    public HillResortsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);
        //Create an ArrayList of Hill Resorts.
        ArrayList<ListItem> hillResortList = new ArrayList<ListItem>();
        //Add Hill Resorts in the list.
        hillResortList.add(new ListItem(NIVANT_HILL_RESORT, SATARA,
                R.drawable.ic_hotel_black_24dp));
        hillResortList.add(new ListItem(HOTEL_BAKULA, SATARA,
                R.drawable.ic_hotel_black_24dp));
        hillResortList.add(new ListItem(KAAS_HOLIDAY_RESORT, SATARA,
                R.drawable.ic_hotel_black_24dp));
        hillResortList.add(new ListItem(NATURE_PLATEAU_PARADISE, SATARA,
                R.drawable.ic_hotel_black_24dp));
        hillResortList.add(new ListItem(HOTEL_DHANSAGAR, SATARA,
                R.drawable.ic_hotel_black_24dp));

        //Create an ArrayAdapter for the data source.
        ListItemAdapter hillResortsAdapter = new ListItemAdapter(getActivity(), hillResortList,
                R.color.category_hill_resorts);
        //Find ListView from the view hierarchy.
        ListView hillResortListView = (ListView) rootView.findViewById(R.id.list);
        //Set adapter on the ListView.
        hillResortListView.setAdapter(hillResortsAdapter);
        return rootView;
    }

}
