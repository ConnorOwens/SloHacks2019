package com.example.kirby.spotifyplaylistmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistAuthentication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_authentication);
        final Button searchPlaylist = findViewById(R.id.searchPlaylistButton);
        searchPlaylist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //authenticate
            }
        });
    }
}
