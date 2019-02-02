package com.example.kirby.spotifyplaylistmaker;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class PlaylistView extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_view);
        final FloatingActionButton addSongButton = findViewById(R.id.addButton);
        addSongButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(PlaylistView.this, AddToPlaylist.class));
            }
        });
        RecyclerView playlist = (RecyclerView) findViewById(R.id.playlist_view_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        //mLayoutManager = new LinearLayoutManager(this);
        //playlist.setLayoutManager(mLayoutManager);
        /*
        Song despacito = new Song();
        despacito.setArtist("Luis Fonsi");
        despacito.setSongName("Despacito");
        Song dickomode = new Song();
        dickomode.setArtist("Kusorare");
        dickomode.setSongName("Dicko Mode");
        Song stoopid = new Song();
        stoopid.setArtist("6ix9ine");
        stoopid.setSongName("STOOPID");
        Song niteAndDay = new Song();
        niteAndDay.setArtist("Al B Sure");
        niteAndDay.setSongName("Nite & Day");
        List<Song> myDataset = new ArrayList<Song>();
        myDataset.add(dickomode);
        myDataset.add(despacito);
        myDataset.add(stoopid);
        myDataset.add(niteAndDay);
*/
        // specify an adapter (see also next example)
        PlaylistViewAdapter adapter = new PlaylistViewAdapter(myDataset);
        playlist.setAdapter(adapter);
        playlist.setLayoutManager(new LinearLayoutManager(this));

    }
}
