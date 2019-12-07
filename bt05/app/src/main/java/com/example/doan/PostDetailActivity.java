package com.example.doan;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PostDetailActivity extends AppCompatActivity {
    TextView txt_id;
    TextView txt_title;
    ImageView imv_url;
    TextView txt_short_desc;
    TextView txt_full_desc;
    WebView detail_video;
    RatingBar ratingBar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        txt_id = findViewById(R.id.detail_post_id);
        txt_title = findViewById(R.id.detail_post_title);
        imv_url = findViewById(R.id.detail_image);
        txt_short_desc = findViewById(R.id.detail_short_desc);
        txt_full_desc = findViewById(R.id.detail_full_desc);
        ratingBar = findViewById(R.id.detail_rating);
        detail_video = findViewById(R.id.detail_video);

        int position = getIntent().getIntExtra("position", 0);
        txt_id.setText("#Entry " + Data.ids[position] + "");
        txt_title.setText(Data.title[position] + "");
        new DownloadImage(imv_url).execute(Data.urls[position]);
        txt_short_desc.setText(Data.short_desc[position]);
        txt_full_desc.setText(Data.full_desc[position]);
        detail_video.getSettings().setJavaScriptEnabled(true);
        detail_video.getSettings().setLoadWithOverviewMode(true);
        detail_video.getSettings().setAppCacheEnabled(true);
        detail_video.setWebChromeClient(new WebChromeClient());
        detail_video.setBackgroundColor(0x00000000);
        detail_video.loadDataWithBaseURL("", Data.video_url[position],
                "text/html", "UTF-8", null);
        ratingBar.setRating(Data.ratings[position]);
    }
}
