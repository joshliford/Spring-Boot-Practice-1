package com.example.mycollections.models;

public class Album extends LibraryItem {

    private int track;
    private String artistName;

    public Album(String name, int year, String artistName, int track) {
        super(name, year);
        this.artistName = artistName;
        this.track = track;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return name + " by " + artistName;
    }
}
