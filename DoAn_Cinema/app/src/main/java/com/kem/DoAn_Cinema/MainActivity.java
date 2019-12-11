package com.kem.DoAn_Cinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button getmatbiec;
    Button getchichiemem;
    Button getgiangsinh;
    Button getfordvsferrari;
    Button getanhtraiyeuquai;
    Button getjumanji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getmatbiec = (Button) findViewById(R.id.btmatbiec);
        getmatbiec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intrudu_matbiec.class);
                startActivity(intent);
            }
        });

        getjumanji = (Button) findViewById(R.id.btjumanji);
        getjumanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_jumanji.class);
                startActivity(intent);
            }
        });

        getchichiemem = (Button) findViewById(R.id.btchichiemem);
        getchichiemem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_chichiemem.class);
                startActivity(intent);
            }
        });

        getanhtraiyeuquai = (Button) findViewById(R.id.btanhtraiyeuquai);
        getanhtraiyeuquai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_anhtraiyeuquai.class);
                startActivity(intent);
            }
        });

        getgiangsinh = (Button) findViewById(R.id.btgiangsinhnamay);
        getgiangsinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_giangsinhnamay.class);
                startActivity(intent);
            }
        });

        getfordvsferrari = (Button) findViewById(R.id.btfordvsferrari);
        getfordvsferrari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, intr_fordvsferrari.class);
                startActivity(intent);
            }
        });
    }
}
