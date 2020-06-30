package com.android.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListenNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_now);
        TextView search = (TextView) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ListenNow.this, Search.class);
                ListenNow.this.startActivity(myIntent);
            }
        });
        TextView nowPlaying = (TextView) findViewById(R.id.now);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ListenNow.this, NowPlaying.class);
                ListenNow.this.startActivity(myIntent);
            }
        });
        TextView favourites = (TextView) findViewById(R.id.favourites);
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ListenNow.this, Favourites.class);
                ListenNow.this.startActivity(myIntent);
            }
        });
        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ListenNow.this, Albums.class);
                ListenNow.this.startActivity(myIntent);
            }
        });
        TextView paid = (TextView) findViewById(R.id.paid);
        paid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ListenNow.this, com.android.example.musicplayer.Paid.class);
                ListenNow.this.startActivity(myIntent);
            }
        });
    }
}
