package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.Toast;
import android.content.Context;

public class TestActivity extends AppCompatActivity {
    Intent intent;
    private Button watchedButton;
    private Button laterButton;
    private Button blockButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        DatabaseHelper db = new DatabaseHelper(this);
        ArrayList<HashMap<String, String>> movieList = db.GetMovies();
        ListView lv = (ListView) findViewById(R.id.user_list);
        ListAdapter adapter = new SimpleAdapter(TestActivity.this, movieList, R.layout.list_row, new String[]{"movieName"}, new int[]{R.id.name});
        lv.setAdapter(adapter);
        watchedButton = (Button) findViewById(R.id.test_btn1);
        laterButton = (Button) findViewById(R.id.test_btn2);
        blockButton = (Button) findViewById(R.id.test_btn3);



    }
}

