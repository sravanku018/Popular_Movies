package com.example.subramanyam.popular_movies;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity{

private LayoutInflater layoutInflater;
 static public ArrayList<MovieData> images;
 static  public ArrayList<String> movieUrl;
  static public   ImageAdapter imageAdapter;
     GridView gridView;
     ImageView imageView;
    MovieData movieData;
   static public SharedPreferences sharedPreferences;
   static  public Context context;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieData=new MovieData();
     //   imageView=(ImageView) findViewById(R.id.movieImages);
        imageAdapter=new ImageAdapter(this);
        Intent intent=new Intent(getApplicationContext(),MoviegridView.class);

        startActivity(intent);







       images = new ArrayList<MovieData>();
        movieUrl = new ArrayList<String>();
        movieData=new MovieData();





        networkConnected();



    }



        @Override
    protected void onResume() {
        super.onResume();
    }

    public void networkConnected()
    {
        Netwrok netwrok;

        Uri.Builder builder=new Uri.Builder();
        builder.scheme("http")
                .authority("api.themoviedb.org")
                .path("/3/movie/popular")
                .appendQueryParameter("api_key","")
                .build();




       String Url=builder.toString();
        netwrok = new Netwrok();

        try {
            netwrok.execute(Url).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


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
