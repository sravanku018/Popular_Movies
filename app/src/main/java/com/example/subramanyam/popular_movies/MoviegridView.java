package com.example.subramanyam.popular_movies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;

public class MoviegridView extends AppCompatActivity {
    GridView gridView;
    ImageView imageView;
 static    public  ImageAdapter imageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moviegrid_view);
        imageView=(ImageView) findViewById(R.id.movieImages);
       imageAdapter =  new ImageAdapter(this);



       gridView =  (GridView) findViewById(R.id.gridview);
       gridView.setAdapter(imageAdapter);


   }



  /*  @Override
    public void onBackPressed() {

        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);

        startActivity(startMain);

    }*/
}

