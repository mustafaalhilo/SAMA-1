package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapterWatched extends ArrayAdapter<Movie> {
    private Context mContext;
    private List<Movie> moviesList = new ArrayList<>();

    public MovieAdapterWatched(@NonNull Context context,/*@LayoutRes*/ ArrayList<Movie> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item_watched,parent,false);

        Movie currentMovie = moviesList.get(position);


        TextView name = listItem.findViewById(R.id.textView_name_watched);
        name.setText(currentMovie.getmName());

        TextView genre = listItem.findViewById(R.id.textView_genre_watched);
        genre.setText(currentMovie.getmGenre());
        Button removeBtn = (Button)listItem.findViewById(R.id.remove_watched_btn);


        return listItem;
    }
}
