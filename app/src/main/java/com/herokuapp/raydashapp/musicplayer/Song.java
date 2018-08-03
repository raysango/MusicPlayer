package com.herokuapp.raydashapp.musicplayer;

public class Song {

    private String mTitle;
    private String mArtist;
    private String mTime;


    public Song(String Title, String Artist, String Time){
        mTitle = Title;
        mArtist = Artist;
        mTime = Time;
    }

    public String getSongTitle(){
        return mTitle;
    }

    public String getSongArtist() {
        return mArtist;
    }

    public String getSongTime() {
        return mTime;
    }
}
