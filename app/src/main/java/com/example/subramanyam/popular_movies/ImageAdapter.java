package com.example.subramanyam.popular_movies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by subramanyam on 19-02-2018.
 */


    public class ImageAdapter extends BaseAdapter {
        private LayoutInflater inflater;
        private Context mContext;
        private GridView gridView;

        

        public ImageAdapter(Context c) {
            mContext = c;
        }


    @Override
    public int getCount() {
        return MainActivity.images.size();
    }

    public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;


            if (convertView == null) {
                // if it's not recycled, initialize some attributes



                LayoutInflater layoutInflater= (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView=inflater.inflate(R.layout.moviegrid,null);




                imageView= new ImageView(mContext);



            } else
            {

                imageView = (ImageView) convertView;

            }


          Picasso.with(mContext).load(MainActivity.movieUrl.get(position)).fit().resize(300,200).centerInside().error(R.drawable.ic_launcher_background).into(imageView);



            return imageView;
        }

    }
