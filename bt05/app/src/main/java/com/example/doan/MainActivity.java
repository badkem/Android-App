package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridview;
    private AdapterView.OnItemClickListener onitemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = findViewById(R.id.gridview);
        PostEntryAdapter postentryadapter = new PostEntryAdapter(getApplicationContext(), loadData());
        gridview.setAdapter(postentryadapter);
        gridview.setOnItemClickListener(onitemClick);
    }

    private ArrayList<PostEntry> loadData() {
        ArrayList<PostEntry> postentries = new ArrayList<>();
        for (int i = 0; i < Data.ids.length; i++) {
            PostEntry post = new PostEntry(Data.ids[i], Data.title[i], Data.urls[i], Data.short_desc[i], Data.full_desc[i], Data.video_url[i], Data.ratings[i]);
            postentries.add(post);
        }
        return postentries;
    }
}
