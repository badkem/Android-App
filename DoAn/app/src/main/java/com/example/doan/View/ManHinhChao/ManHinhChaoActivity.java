package com.example.doan.View.ManHinhChao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.example.doan.View.TrangChu.MainActivity;
public class ManHinhChaoActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {

                } finally {
                    Intent iTrangChu = new Intent(ManHinhChaoActivity.this, MainActivity.class);
                    startActivity(iTrangChu);
                }
            }
        });
        thread.start();
    }
}
