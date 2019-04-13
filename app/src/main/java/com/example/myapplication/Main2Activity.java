package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    private ListView listView;
    private MovieAdapter mAdapter;
    ///fasdfsdfawefwerf
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie( "After Earth", "2013"));
        moviesList.add(new Movie("Baby Driver", "2017"));
        moviesList.add(new Movie("Deadpool", "2016"));
        moviesList.add(new Movie( "Divergent", "2014"));
        moviesList.add(new Movie( "Fight Club", "1999"));
        moviesList.add(new Movie("Jaws", "1975"));
        moviesList.add(new Movie("Pirates of the Caribbean", "2011"));
        moviesList.add(new Movie("Star Wars", "2016"));
        moviesList.add(new Movie("The Grey", "2011"));


        mAdapter = new MovieAdapter(this, moviesList);
        listView.setAdapter(mAdapter);

    }


}
