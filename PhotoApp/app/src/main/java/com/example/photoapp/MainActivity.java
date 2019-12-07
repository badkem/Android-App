package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridview;
    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getApplicationContext(), ViewPhoto.class);
            /*Photo photo = (Photo)gridview.getAdapter().getItem(position);
            intent.putExtra("id", photo.getId());*/
            intent.putExtra("id", position);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = findViewById(R.id.gridview);
        PhotoAdapter adapter = new PhotoAdapter(generatePhotoData(), getApplicationContext());
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(onitemclick);
    }

    public ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, 5, 100, 120389, "https://chiasenhac.vn/storage/data/artist_avatar/1/158.jpg", "Billie", true));
        photos.add(new Photo(1, 2, 50, 88378, "https://photo-zmp3.zadn.vn/thumb/94_94/avatars/8/6/0/d/860d22b640a791ffd7ec57aba81ac2b5.jpg", "Noo Phuoc Thinh", false));
        photos.add(new Photo(2, 5, 90, 737823, "https://photo-zmp3.zadn.vn/thumb/94_94/avatars/e/e/ee58fcc0ff45002b8d416bd7685809ce_1487040461.jpg", "Son Tung MTP", true));
        photos.add(new Photo(3, 2, 100, 73782, "https://photo-resize-zmp3.zadn.vn/w94_r1x1_jpeg/covers/c/b/cbe2dfb3d65dc97c68f983d09bff78a7_1476796126.jpg", "Soobin Hoang Son", true));
        photos.add(new Photo(4, 4, 80, 2432444, "https://photo-zmp3.zadn.vn/thumb/94_94/avatars/4/3/43d8be33dc00a33132c82adb9d0d3a54_1509355224.jpg", "Bich Phuong", true));
        photos.add(new Photo(5, 3, 70, 4324234, "https://photo-zmp3.zadn.vn/thumb/94_94/avatars/b/3/6/a/b36ab767f6ebd1ef2118645592924143.jpg", "Pham Quynh Anh", true));
        photos.add(new Photo(6, 5, 90, 7374482, "https://photo-zmp3.zadn.vn/thumb/94_94/avatars/8/4/84fa37746a6cbcc7b1b18b3714ae6a67_1503633402.jpg", "Taylor Swift", true));
        return photos;
    }
}
