package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import static android.support.v4.content.ContextCompat.startActivity;

public class CursorAdapterRec extends CursorAdapter {
    private LayoutInflater cursorInflater;
    // Default constructor
    private Button watchedB;
    private Button blockB;
    private Button wmlB;
    public CursorAdapterRec(Context context, Cursor cursor, int flags) {
        super(context, cursor, 0);
        cursorInflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

    }

    public void bindView(View view, final Context context, final Cursor cursor) {
        TextView textViewTitle = (TextView) view.findViewById(R.id.textView_name);
        final String title = cursor.getString(cursor.getColumnIndex("_id"));
        textViewTitle.setText(title);
        wmlB=(Button) view.findViewById(R.id.wml_btn);
        watchedB=(Button) view.findViewById(R.id.watched_btn);
        blockB=(Button) view.findViewById(R.id.block_btn);
        wmlB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //this is solely an example and proof of concept
                DatabaseHelper db = new DatabaseHelper(context);
                String name = title +"420";
                String genre = "Horrpr";
                String rating = "4";
                long res = db.addMovie(name, genre, rating);

            }
        });
        watchedB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        blockB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });


    }

    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // R.layout.list_row is your xml layout for each row
        return cursorInflater.inflate(R.layout.list_item, parent, false);
    }
}
