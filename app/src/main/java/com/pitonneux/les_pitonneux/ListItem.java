package com.pitonneux.les_pitonneux;

/**
 * Created by androidweardev on 6/2/17.
 */

public class ListItem {

    private String mHeader;
    private String mDescription;

    //this is for the calendar listView
    private String mMonth;
    private String mDay;


    //this is the image for local/Online Resource and User profile
    private String mImageResourceUrl = NO_IMAGE_PROVIDED;

    //TODO: need to review this and arrange it for month and day
    private static final String NO_IMAGE_PROVIDED = null;

    private static final String NO_DATE_PROVIDED = null;




    /**
     * this constructor is for newsFeed listItem
     *
     * @param header
     * @param description
     */
    public ListItem(String header, String description) {
        this.mHeader = header;
        this.mDescription = description;

    }


    /**
     * this constructor is for
     * @param header
     * @param description
     * @param imageResourceUrl //TODO:profile image, image resource should change size for local/online resource
     */
    public ListItem(String header, String description, String imageResourceUrl) {

        this.mHeader = header;
        this.mDescription = description;
        this.mImageResourceUrl = imageResourceUrl;
    }


    /**
     * this is for date and the meetUp schedule
     * @param header
     * @param description
     * @param month
     * @param day
     */
    public ListItem(String header, String description, String month, String day) {// change date to unix time
        this.mHeader = header;
        this.mDescription = description;
        this.mMonth = month;
        this.mDay = day;

    }



    public boolean hasImage(){

        return mImageResourceUrl != NO_IMAGE_PROVIDED;
    }

    public boolean hasDate(){
        //TODO: strange warning happening need more answer
        return mDay != NO_DATE_PROVIDED && mMonth != NO_DATE_PROVIDED;
    }














    public String getHeader() {
        return mHeader;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getMonth() {
        return mMonth;
    }

    public String getDay() {
        return mDay;
    }

    public String getImageResourceUrl() {
        return mImageResourceUrl;
    }



}
