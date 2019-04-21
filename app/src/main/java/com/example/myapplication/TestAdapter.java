package com.example.myapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;


public class TestAdapter extends ArrayAdapter<String> {
    private Context mContext;
    private List<String> moviesList = new ArrayList<>();
    private Button watchedB;
    private Button blockB;
    private Button wmlB;

    public TestAdapter(@NonNull Context context, ArrayList<String> list){
        super(context,0,list);
        mContext=context;
        moviesList=list;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;
        if(listItem==null){
            listItem=LayoutInflater.from(mContext).inflate(R.layout.list_row,parent,false);
        }
        String currentMovie = moviesList.get(position);
        TextView name = (TextView) listItem.findViewById(R.id.name);
        name.setText(currentMovie);
        wmlB=(Button) convertView.findViewById(R.id.test_btn1);
        watchedB=(Button) convertView.findViewById(R.id.test_btn2);
        blockB=(Button) convertView.findViewById(R.id.test_btn3);

        return listItem;
    }
}
