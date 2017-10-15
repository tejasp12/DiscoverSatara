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
        View rootView =inflater.inflate(R.layout.activity_hotels,container,false);
        //Create an ArrayList of Hotels.
        ArrayList<ListItem> hotelList = new ArrayList<ListItem>();
        //Add Hotels in the list.
        hotelList.add(new ListItem("Hotel Rajtara","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Gulbahar","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Maharaja Regency","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Sagar Delux","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Radhika Palace","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Galaxi","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Shriman","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Aakar","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel LakeView","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel Preeti Executive","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        hotelList.add(new ListItem("Hotel OM Executive","Satara",
                R.drawable.ic_local_hotel_black_24dp));
        //Create an ArrayAdapter as the Data source.
        ListItemAdapter hotelsAdapter = new ListItemAdapter(getActivity(),hotelList);
        //Find the listView in the view hierarchy.
        ListView hotelListView = (ListView)rootView.findViewById(R.id.list);
        //Attach adapter to the list.
        hotelListView.setAdapter(hotelsAdapter);
        return rootView;
    }

}
