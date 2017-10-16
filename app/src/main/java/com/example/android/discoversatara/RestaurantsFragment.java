package com.example.android.discoversatara;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Toast.makeText(getTargetFragment().getActivity(),"Explore Restaurants",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);
        //Create an ArrayList of Restaurants.
        ArrayList<ListItem> restaurantsList = new ArrayList<ListItem>();
        //Add Restaurants in the list.
        restaurantsList.add(new ListItem(AJINKYA_RESTAURANT, PURE_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(SAYLI_RESTAURANT, PURE_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(THE_BLACK_PEARL_CAFÉ, VEG_NON_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(KABADI_RESTO, PURE_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(CAD_M_CAD_B, PURE_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(BIG_BITE, PURE_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(SWAD_RESTO, VEG_NON_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(MANAS_RESTO, VEG_NON_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(KANASE_RESTO, VEG_NON_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(DADAZ_BIRYANI_HOUSE, VEG_NON_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(SHIVSAGAR_RESTO, PURE_VEG,
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem(SITARA_RESTO, VEG_NON_VEG,
                R.drawable.ic_local_dining_black_24dp));

        //Create an ArrayAdapter for the data source.
        ListItemAdapter restaurantsAdapter = new ListItemAdapter(getActivity(), restaurantsList,
                R.color.category_restos);
        //Find ListView from the view hierarchy.
        ListView hillResortListView = (ListView) rootView.findViewById(R.id.list);
        //Set adapter on the ListView.
        hillResortListView.setAdapter(restaurantsAdapter);
        return rootView;
    }

}
