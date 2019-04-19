package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME= "sama.db";
    public static final String MOVIE_TABLE= "MOVIE";
    public static final String M_ID= "movieId";
    public static final String M_NAME= "movieName";
    public static final String M_GENRE= "genre";
    public static final String M_RATING= "rating";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists movie(\n" +
                "movieId INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "movieName TEXT NOT NULL UNIQUE ,\n" +
                "genre TEXT NOT NULL,\n" +
                "rating TEXT\n" +
                ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+ MOVIE_TABLE);
        onCreate(db);
    }

    public long addMovie(String movieName, String genre,String rating){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("movieName", movieName);
        contentValues.put("genre", genre);
        contentValues.put("rating", rating);
        long res= db.insert("MOVIE", null,contentValues);
        db.close();
        return res;

    }

    public Cursor getRecomendationList(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT movieName FROM"+ MOVIE_TABLE, null);
        return data;
    }
}
