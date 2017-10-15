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
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.activity_hotels,container,false);
        //Create an ArrayList of Restaurants.
        ArrayList<ListItem> restaurantsList = new ArrayList<ListItem>();
        //Add Restaurants in the list.
        restaurantsList.add(new ListItem("Ajinkya Restaurant","Pure Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Sayli Restaurant","Pure Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("The Black pearl Café","Veg & Non-Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Kabadi Resto","Pure Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("CAD(M) CAD(B)","Pure Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Big Bite","Pure Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Swad Resto","Veg & Non-Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Manas Resto","Veg & Non-Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Kanase Resto","Veg & Non-Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Dadaz Biryani House","Veg & Non-Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Shivsagar Resto","Pure Veg",
                R.drawable.ic_local_dining_black_24dp));
        restaurantsList.add(new ListItem("Sitara Resto","Veg & Non-Veg",
                R.drawable.ic_local_dining_black_24dp));

        //Create an ArrayAdapter for the data source.
        ListItemAdapter restaurantsAdapter = new ListItemAdapter(getActivity(),restaurantsList);
        //Find ListView from the view hierarchy.
        ListView hillResortListView = (ListView)rootView.findViewById(R.id.list);
        //Set adapter on the ListView.
        hillResortListView.setAdapter(restaurantsAdapter);
        return rootView;
    }

}
