package com.example.bt04;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class DownloadImage  extends AsyncTask <String, Void, Bitmap>{
    ImageView imageview;
    public DownloadImage(ImageView imageview){
        this.imageview = imageview;
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        String url = strings[0];
        Bitmap result = null;
        try {
            InputStream in = new URL(url).openStream();
            result = BitmapFactory.decodeStream(in);
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    @Override
    protected void onPostExecute(Bitmap bitmap){
        imageview.setImageBitmap(bitmap);
    }
}
