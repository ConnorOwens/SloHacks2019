package com.example.kirby.spotifyplaylistmaker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class PlaylistViewAdapter extends RecyclerView.Adapter<PlaylistViewAdapter.ViewHolder> {
    private List<Song> mSongs;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView nameTextView;
        public Button messageButton;
        public ViewHolder(View v) {
            super(v);
            nameTextView = (TextView) itemView.findViewById(R.id.song_name);
            messageButton = (Button) itemView.findViewById(R.id.upvote_button);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PlaylistViewAdapter(List<Song> myDataset) {
        mSongs = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PlaylistViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View songView = inflater.inflate(R.layout.song_text_view, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(songView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(PlaylistViewAdapter.ViewHolder viewHolder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //Contact contact = mContacts.get(position);
        Song song = mSongs.get(position);
        // Set item views based on your views and data model
        TextView textView = viewHolder.nameTextView;
        textView.setText(song.getSongName() + " - " + song.getArtist());
        Button button = viewHolder.messageButton;
        button.setText("Upvote?");
        button.setEnabled(true);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mSongs.size();
    }
}