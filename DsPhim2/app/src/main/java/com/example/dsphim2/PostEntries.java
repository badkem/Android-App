package com.example.dsphim2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class PostEntries extends AppCompatActivity {
    GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_entries);
        gridview = findViewById(R.id.gridview);

        int position = getIntent().getIntExtra("position",0);

        ArrayList<PostEntry> post = new ArrayList<>();

        for (int i=0;i<Data.ids.length;i++){
            if (Data.id_dm[i] == position ){
                PostEntry p = new PostEntry(Data.id_dm[i],Data.ids[i],Data.title[i],Data.urls[i],Data.short_desc[i],
                                Data.full_desc[i],Data.video_url[i],Data.ratings[1]);
                post.add(p);
            }
        }

        PostEntryAdapter postentryadapter = new PostEntryAdapter(getApplicationContext(),post);
        gridview.setAdapter(postentryadapter);
    }
}
