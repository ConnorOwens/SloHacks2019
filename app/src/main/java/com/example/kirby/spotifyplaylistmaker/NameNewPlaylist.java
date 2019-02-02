package com.example.kirby.spotifyplaylistmaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class NameNewPlaylist extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_new_playlist);
    }
    public void createPlaylist(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.newPlaylistName);
        EditText passwordEditText = (EditText) findViewById(R.id.newPlaylistPassword);
        String newPlaylistName =  nameEditText.getText().toString();
        String newPlaylistPassword = passwordEditText.getText().toString();
        List inputList = new ArrayList();
        DatabaseReference playlistsRef = databaseReference.child("playlistNames");
        DatabaseReference playlistInst = playlistsRef.child(newPlaylistName);
        playlistInst.child("password").setValue(newPlaylistPassword);
        playlistInst.child("songList").setValue(inputList);

    }
}
