package com.example.myapplication;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class WatchedPage extends AppCompatActivity {


    private DatabaseHelper db;
    private ListView listView;
    private CursorAdapterWatched cAdapter;
    private Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watched_page);
        db = new DatabaseHelper(this);
        listView = (ListView) findViewById(R.id.movies_list_watched);
        mCursor = db.getRecomendationList();
        //replace this method to get the list you want to be shown
        cAdapter = new CursorAdapterWatched(this, mCursor, 0);
        listView.setAdapter(cAdapter);

    }
}
