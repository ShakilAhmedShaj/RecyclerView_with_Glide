package com.t3ch.shaj.recyclerviewwithglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();


    }

    private void initImageBitmaps() {

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Godfather%20Part%201.jpg");
        mNames.add("The Godfather (1972)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/The%20Dark%20Knight.jpg");
        mNames.add("The Dark Knight (2008)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Shawshank%20Redemption.jpg");
        mNames.add("The Shawshank Redemption (1994)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Blade%20Runner.jpg");
        mNames.add("Blade Runner (1982)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Inception.jpg");
        mNames.add("Inception (2010)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Jurassic%20Park.jpg");
        mNames.add("Jurassic Park (1993)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/The%20Matrix.jpg");
        mNames.add("The Matrix (1999)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Terminator%202.jpg");
        mNames.add("Terminator 2: Judgment Day (1991)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Guardians%20of%20the%20Galaxy.jpg");
        mNames.add("Guardians Of The Galaxy (2014)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Mad%20Max%20Fury%20Road.jpg");
        mNames.add("Mad Max: Fury Road (2015)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Gladiator.jpg");
        mNames.add("Gladiator (2000)");

        mImageUrls.add("https://cdn.empireonline.com/jpg/70/0/0/640/480/aspectfit/0/0/0/0/0/0/c/features/59395a49f68e659c7aa3a1a8/Interstellar.jpg");
        mNames.add("Interstellar (2014)");


        initRecyclerView();


    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
