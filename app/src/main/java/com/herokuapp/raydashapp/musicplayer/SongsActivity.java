package com.herokuapp.raydashapp.musicplayer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<Song>();



        songs.add(new Song("Get Lucky", "Pharrell Williams", "6:09"));
        songs.add(new Song("Grafton Street", "Dido", "5:57"));
        songs.add(new Song("Billie Jean", "Michael Jackson", "4:19"));
        songs.add(new Song("Bedroom Hymns", "Florence + the Machine", "3:02"));
        songs.add(new Song("Sign On the Window", "Bob Dylan", "3:39"));
        songs.add(new Song("No Woman No Cry", "Bob Marley", "7:08"));
        songs.add(new Song("The Wonder of You", "Conor O'Brien", "2:48"));
        songs.add(new Song("Count On Me", "Bruno Mars", "3:17"));

        //Initialize Adapter
        SongAdapter itemsAdapter = new SongAdapter(this, songs);
        //Get ListView
        ListView listView = (ListView) findViewById(R.id.list);
        //Attache adapter to ListView
        listView.setAdapter(itemsAdapter);

    }

    public void playSong(View view) {
        Intent i = new Intent(SongsActivity.this , SongActivity.class); //Explicit Intent
        i.putExtra("songTitle", view.getTag().toString());
        Log.d("Song Name", view.getTag().toString());
        startActivity(i);
    }
}
