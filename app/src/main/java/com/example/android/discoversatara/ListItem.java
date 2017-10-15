package com.example.android.discoversatara;

/**
 * Custom Class ListItem for the list items
 * in the listView
 */
public class ListItem {
    private String mHotelName;
    private String mHotelAddress;
    private String mHotelCategory;
    private int mImageResourceID;
    //Define Constructor for a class.
    public ListItem(String hotelname,String hotelAddress,int imageResourceID){
        mHotelName = hotelname;
        mHotelAddress = hotelAddress;
        mImageResourceID = imageResourceID;
    }
    //Define another constructor.
    public ListItem(String hotelname,String hotelCategory,String hotelAddress,
                    int imageResourceID){
        mHotelName = hotelname;
        mHotelCategory = hotelCategory;
        mHotelAddress = hotelAddress;
        mImageResourceID = imageResourceID;
    }
    //Define Public methods to access private variable mHotelName.
    public String getHotelName(){
        return mHotelName;
    }
    //Define Public methods to access private variable mHotelCategory.
    public String getHotelCategory(){
        return mHotelAddress;
    }
    public int getImageResourceID(){
        return mImageResourceID;
    }
}
