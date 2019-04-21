package com.example.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class CursorAdapterWML extends CursorAdapter {
    private LayoutInflater cursorInflater;
    // Default constructor
    private Button watchedBtn;
    private Button removeBtn;
    public CursorAdapterWML(Context context, Cursor cursor, int flags) {
        super(context, cursor, 0);
        cursorInflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

    }

    public void bindView(View view, Context context, Cursor cursor) {
        TextView textViewTitle = (TextView) view.findViewById(R.id.textView_name_watchmelater);
        String title = cursor.getString(cursor.getColumnIndex("_id"));
        textViewTitle.setText(title);

        watchedBtn = (Button)view.findViewById(R.id.watched_wml_btn);
        removeBtn = (Button)view.findViewById(R.id.remove_wml_btn);
        watchedBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        removeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });



    }

    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // R.layout.list_row is your xml layout for each row
        return cursorInflater.inflate(R.layout.list_item_watchmelater, parent, false);
    }
}
