package com.example.bt04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView gridview;
    ImageView imageview;
    String[] urls = {
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
            "https://data.chiasenhac.com/data/cover/103/102291.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        gridview = findViewById(R.id.gridview);
//        ImageAdapter imageAdapter = new ImageAdapter(getApplicationContext(),urls);
        imageview = findViewById(R.id.imageview);
        new DownloadImage(imageview).execute("https://chiasenhac.vn/storage/data/artist_cover/1/158.jpg");
    }


}
