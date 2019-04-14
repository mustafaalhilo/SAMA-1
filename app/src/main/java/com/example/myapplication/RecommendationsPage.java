package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RecommendationsPage extends AppCompatActivity {


    private ListView listView;
    private MovieAdapter mAdapter;
    ///fasdfsdfawefwerf
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendations_page);

        listView = findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie( "After Earth", "Horror"));
        moviesList.add(new Movie("Baby Driver", "Comedy"));
        moviesList.add(new Movie("Deadpool", "Action"));
        moviesList.add(new Movie( "Divergent", "Drama"));
        moviesList.add(new Movie( "Fight Club", "Action"));
        moviesList.add(new Movie("Jaws", "Thriller"));
        moviesList.add(new Movie("Pirates of the Caribbean", "Action"));
        moviesList.add(new Movie("Star Wars", "Action"));
        moviesList.add(new Movie("The Grey", "Adult"));


        mAdapter = new MovieAdapter(this, moviesList);
        listView.setAdapter(mAdapter);

    }


}
