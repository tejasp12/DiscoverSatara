package com.example.android.discoversatara;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class DiscoverSataraIntroFragment extends Fragment {


    public static final String HAPPY_JOURNEY = "\n**Happy Journey**";
    public static final String TOUR_OF_SATARA_IS_STARTING_HAPPY_JOURNEY = "Tour of Satara is Starting" +
            HAPPY_JOURNEY;

    public DiscoverSataraIntroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(), TOUR_OF_SATARA_IS_STARTING_HAPPY_JOURNEY
                ,Toast.LENGTH_LONG).show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app_intro, container, false);
    }

}
