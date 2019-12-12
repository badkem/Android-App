package com.kem.DoAn_Cinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ManHinhChaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
