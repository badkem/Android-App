package com.example.dsphim2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getApplicationContext(), PostEntries.class);
            intent.putExtra("position", position + 1);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listview;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        ArrayList<Category> categories = new ArrayList<>();

        for (int i = 0; i < DataDM.id_dm.length; i++) {
            Category c = new Category(DataDM.id_dm[i], DataDM.ten_dm[i], DataDM.url_photo[i]);
            categories.add(c);
        }

        CategoryAdapter categoryAdapter = new CategoryAdapter(getApplicationContext(), categories);
        listview.setAdapter(categoryAdapter);
        listview.setOnItemClickListener(onitemclick);

    }


}
