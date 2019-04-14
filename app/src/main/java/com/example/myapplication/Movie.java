package com.example.myapplication;

public class Movie {


        // Store the id of the  movie poster

        // Store the name of the movie
        private String mName;
        // Store the release date of the movie
        private String mGenre;

        // Constructor that is used to create an instance of the Movie object
        public Movie(String mName, String mGenre) {

            this.mName = mName;
            this.mGenre = mGenre;
        }


        public String getmName() {
            return mName;
        }

        public void setmName(String mName) {
            this.mName = mName;
        }

        public String getmGenre() {
            return mGenre;
        }

        public void setmRelease(String mRelease) {
            this.mGenre = mRelease;
        }

}
