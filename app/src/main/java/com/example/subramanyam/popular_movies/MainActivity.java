package com.example.subramanyam.popular_movies;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

private LayoutInflater layoutInflater;
 static public ArrayList<MovieData> images;
 static  public ArrayList<String> movieUrl;
  static public   ImageAdapter imageAdapter;
    static public GridView gridView;
    ImageView imageView;
    MovieData movieData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView) findViewById(R.id.movieImages);








    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        gridView =(GridView) findViewById(R.id.gridview);
        networkConnected();
        gridView.setAdapter(imageAdapter);
        images =new ArrayList<MovieData>();


        return super.onCreateView(parent, name, context, attrs);
    }

    public void networkConnected()
    {
        Netwrok netwrok;

        String Url="http://api.themoviedb.org/3/movie/popular?api_key=";
        netwrok = new Netwrok();
        netwrok.execute(Url);
        if(netwrok != null)
        {
            Toast.makeText(this, "network connected", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


    }


    }
