package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;

public class AddDataPage extends AppCompatActivity {

    EditText mTextMname;
    EditText mTextMgenre;
    EditText mTextMrating;
    Button mButtonMadd;
    DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_page);
        //add information that is loaded onto screen here

        db = new DatabaseHelper(this);
        mTextMname = (EditText)findViewById(R.id.Mname);
        mTextMgenre = (EditText)findViewById(R.id.Mgenre);
        mTextMrating = (EditText)findViewById(R.id.Mrating);
        mButtonMadd = (Button)findViewById(R.id.Madd);

        mButtonMadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mTextMname.getText().toString().trim();
                String genre = mTextMgenre.getText().toString().trim();
                String rating = mTextMrating.getText().toString().trim();
                long res = db.addMovie(name, genre, rating);
                if(res != -1){
                    Intent moveLoginPage = new Intent(AddDataPage.this, LoginLogoutAdmin.class);
                    startActivity(moveLoginPage);

                }

            }
        });

    }


}
