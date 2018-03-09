package com.example.subramanyam.popular_movies;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{


 static public ImageAdapter imageAdapter;
 static public ArrayList<MovieData> images;
 static  public ArrayList<String> movieUrl;
    static public MovieData movieData;













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieData=new MovieData();
        images = new ArrayList<MovieData>();
        movieUrl = new ArrayList<String>();


      //  Intent intent=new Intent(this,MoviegridView.class);
       // startActivity(intent);

        //networkConnected();






    }






 /*   public void networkConnected()
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

            } */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        isNetworkAvailable();
        Toast.makeText(this, "network connected", Toast.LENGTH_SHORT).show();
        Netwrok netwrok=new Netwrok();

        if(item.getItemId() == R.id.popular)


        {
            netwrok.execute("http://api.themoviedb.org/3/movie/popular?api_key=");

        }
        else
        {
            netwrok.execute("http://api.themoviedb.org/3/movie/top_rated?api_key=");

        }

        Intent intent=new Intent(this,MoviegridView.class);
        startActivity(intent);

        return  true;
    }







    public void isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        // if no network is available networkInfo will be null
        // otherwise check if we are connected
        if (networkInfo != null && networkInfo.isConnected()) {
        }


    }






    }
