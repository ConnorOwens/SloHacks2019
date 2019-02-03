package com.example.kirby.spotifyplaylistmaker;

public class Song {
    private String songName;
    private String artist;
    private int upVotes;
    private int downVotes;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void incrementUpVotes() {
        upVotes = upVotes + 1;
    }

    public void decrementUpVotes() {
        upVotes = upVotes - 1;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }
}
