package com.example.bt04;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private String[] imagelist;

    public ImageAdapter(Context context, String[] imagelist) {
        this.context = context;
        this.imagelist = imagelist;
    }

    @Override
    public int getCount() {
        return imagelist.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageview;
        if (convertView==null){
            imageview = new ImageView(context);
        } else{
            imageview = (ImageView)convertView;
        }
        new DownloadImage(imageview).execute(imagelist[position]);
        return imageview;
    }
}
