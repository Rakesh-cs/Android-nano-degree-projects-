package com.example.android.musicalstructureapp;

public class SongsList {
    private String mnameofcomposer;
    public int maudioresourceid;
    // The opus.
    private String song0;

    /**
     * Create a new SongsListobject.
     */
    public SongsList(String nameofcomposer, String songname, int audioresourceid) {
        mnameofcomposer = nameofcomposer;
       song0  =  songname;
       maudioresourceid = audioresourceid;
    }

    public int getmaudioresourceid(){return maudioresourceid;}

    // Get the name of composer.
    public String getNameOfComposer() {
        return mnameofcomposer;
    }

    // Get the name of Song.
    public String getSong() {
        return song0;



    }

}



