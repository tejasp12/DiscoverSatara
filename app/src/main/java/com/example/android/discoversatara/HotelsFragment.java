package com.example.android.discoversatara;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);
        //Create an ArrayList of Hotels.
        ArrayList<ListItem> hotelList = new ArrayList<ListItem>();
        //Add Hotels in the list.
        hotelList.add(new ListItem(R.string.HOTEL_RAJTARA, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_GULBAHAR, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_MAHARAJA_REGENCY, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_SAGAR_DELUX, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_RADHIKA_PALACE, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_GALAXI, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_SHRIMAN, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_AAKAR, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_LAKE_VIEW, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem(HOTEL_PREETI_EXECUTIVE, SATARA,
                R.drawable.ic_local_hotel_black_24dp));
        //Create an ArrayAdapter as the Data source.
        ListItemAdapter hotelsAdapter = new ListItemAdapter(getActivity(), hotelList,
                R.color.category_hotels);
        //Find the listView in the view hierarchy.
        ListView hotelListView = (ListView) rootView.findViewById(R.id.list);
        //Attach adapter to the list.
        hotelListView.setAdapter(hotelsAdapter);
        return rootView;
    }

}
