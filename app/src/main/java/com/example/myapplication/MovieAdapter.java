package com.example.myapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import android.widget.Button;

public class MovieAdapter extends ArrayAdapter<Movie> {
    private Context mContext;
    private List<Movie> moviesList = new ArrayList<>();

    public MovieAdapter(@NonNull Context context,/*@LayoutRes*/ ArrayList<Movie> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Movie currentMovie = moviesList.get(position);


        TextView name = listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView genre = listItem.findViewById(R.id.textView_genre);
        genre.setText(currentMovie.getmGenre());
        Button wmlBtn = (Button)listItem.findViewById(R.id.wml_btn);
        Button watchedBtn = (Button)listItem.findViewById(R.id.watched_btn);
        Button blockBtn = (Button)listItem.findViewById(R.id.block_btn);
        watchedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();*/
            }

        });


        return listItem;
    }
}
