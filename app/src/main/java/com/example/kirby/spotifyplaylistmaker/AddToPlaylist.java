package com.example.kirby.spotifyplaylistmaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class AddToPlaylist extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_playlist);
    }
    public void addSong(View view) {
        EditText songEditText = (EditText) findViewById(R.id.songName);
        EditText artistEditText = (EditText) findViewById(R.id.songArtist);
        String newSongName =  songEditText.getText().toString();
        String newSongArtist = artistEditText.getText().toString();
        List songList = databaseReference.child("playlistNames").child().child("songList");
        Song newSong = new Song();
        newSong.setSongName(newSongName);
        newSong.setArtist(newSongArtist);
        songList.add(newSong);
        databaseReference.child("plalistNames").child().child("songList").setValue(songList);
    }
}
