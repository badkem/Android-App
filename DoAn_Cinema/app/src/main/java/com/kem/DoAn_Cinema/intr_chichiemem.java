package com.kem.DoAn_Cinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class intr_chichiemem extends AppCompatActivity {

    Button datve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intr_chichiemem);

        datve = (Button) findViewById(R.id.btdatve);
        datve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(intr_chichiemem.this, trangchu.class);
                startActivity(intent);
            }
        });

    }


}
