package com.example.kirby.spotifyplaylistmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        final Button newPlaylist = findViewById(R.id.button4);
        newPlaylist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Start.this, NameNewPlaylist.class));
            }
        });
        final Button editAnOldPlaylist = findViewById(R.id.button5);
        editAnOldPlaylist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Start.this, FindAPlaylist.class));
            }
        });
        final Button addToAPlaylist = findViewById(R.id.button3);
        addToAPlaylist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Start.this, AddToPlaylist.class));
            }
        });
    }
}
