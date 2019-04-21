package com.example.myapplication;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class WatchMeLaterPage extends AppCompatActivity {


    private DatabaseHelper db;
    private ListView listView;
    private CursorAdapterWML cAdapter;
    private Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchmelater_page);
        db = new DatabaseHelper(this);
        listView = (ListView) findViewById(R.id.movies_list_watchmelater);
        mCursor = db.getRecomendationList();
        //replace this method to get the list you want to be shown
        cAdapter = new CursorAdapterWML(this, mCursor, 0);
        listView.setAdapter(cAdapter);

    }
}
