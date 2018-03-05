package com.example.subramanyam.popular_movies;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MoviegridView extends Activity {
    GridView gridView;
    ImageView imageView;
    ImageAdapter imageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moviegrid_view);


       gridView =   findViewById(R.id.gridview);
       gridView.setAdapter(new ImageAdapter(this));
       gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               Toast.makeText(MoviegridView.this,"hi", Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });





    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}

