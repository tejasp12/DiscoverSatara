package com.example.android.discoversatara;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/*
* {@link ListItemAdapter}is an {@link ArrayAdapter}that can provide
* the layout for each list based on a data source, which is
* in this case a list of{@link ListItem} objects.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {
    private int mcolorResourceID;

    /*
    * This is our own custom constructor.The context is used to inflate
    * the layout file, and the list is the that we want to populate
    * into the lists.
    *
    * @param context  The current context. Used to inflate the layout file.
    *@param listItems A list of ListItem Objects to display in a list.
     */
    public ListItemAdapter(Activity context, ArrayList<ListItem> listItems, int colorResourceID) {
        super(context, 0, listItems);
        mcolorResourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item, parent, false);
        }
        //Get the {@link ListItem} located at this position in the list.
        ListItem currentListItemObject = getItem(position);
        // Find the TextView in the list_item.xml layout of the id hotel_name.
        TextView hotelName = (TextView) listItemView.findViewById(R.id.hotel_name);
        //Get the hotel name from the currentListItemObject and set this text
        // on the hotelName text view.
        hotelName.setText(currentListItemObject.getHotelName());
        //Find the TextView in the list_item.xml layout of the id address
        // and set the text on this textview by getting it from the currentListItem
        // Object.
        TextView hotelAddress = (TextView) listItemView.findViewById(R.id.address);
        hotelAddress.setText(currentListItemObject.getHotelCategory());
        //Find the Image View from the list item layout & set the image from the
        // current word object.
        ImageView categoryImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        categoryImageView.setImageResource(currentListItemObject.getImageResourceID());
        //Set the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.list_item_container);
        //Find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mcolorResourceID);
        //Set the backgroud color of the text container view.
        textContainer.setBackgroundColor(color);
        //Return the whole listItem layout(Containing 2 TextViews & 1 ImageView)
        //so that it can be shown in the listView.
        return listItemView;
    }
}
