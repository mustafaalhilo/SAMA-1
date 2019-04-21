package com.example.myapplication;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class TestActivity extends AppCompatActivity {
    //Intent intent;
    DatabaseHelper db;
    ListView listView;
    //TestAdapter tAdapter;
    //ArrayList <String> listItem;
    CursorAdapterRec cAdapter;
    Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        db = new DatabaseHelper(this);
        listView=(ListView) findViewById(R.id.user_list);
        mCursor=db.getRecomendationList();
        cAdapter=new CursorAdapterRec(this,mCursor,0);
        listView.setAdapter(cAdapter);

        //viewData();

        /*ArrayList<HashMap<String, String>> movieList = db.GetMovies();
        ListView lv = (ListView) findViewById(R.id.movie_list);
        ListAdapter adapter = new SimpleAdapter(TestActivity.this, movieList, R.layout.test_list_item, new String[]{"movieName"}, new int[]{R.id.name});
        lv.setAdapter(adapter);
        watchedButton = (Button) findViewById(R.id.test_btn1);
        laterButton = (Button) findViewById(R.id.test_btn2);
        blockButton = (Button) findViewById(R.id.test_btn3);*/
        //tAdapter=new TestAdapter(this,movie)


    }
    /*private void viewData(){
        Cursor cursor = db.getRecomendationList();
        if(cursor.getCount()==0){

        }
        else{
            while(cursor.moveToNext()){
                listView.addView(cursor.getString(1));
            }
            tAdapter = new TestAdapter(this,listItem);
            listView.setAdapter(tAdapter);


        }
    }*/
}

