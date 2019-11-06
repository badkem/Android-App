package com.example.myfirstapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtvhoten,txtvtuoi,txtvluong;
    TextView txtvhienthongtin;
    Button btinthongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvhoten=(EditText)findViewById(R.id.txtvhoten);
        txtvtuoi=(EditText)findViewById(R.id.txtvtuoi);
        txtvluong=(EditText)findViewById(R.id.txtvluong);
        btinthongtin=(Button)findViewById(R.id.btinthongtin);
        txtvhienthongtin=(TextView)findViewById(R.id.txtvhienthongtin);

        btinthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String hoten = txtvhoten.getText().toString();
                    int tuoi = Integer.parseInt(txtvtuoi.getText().toString());
                    long luong = Long.parseLong(txtvluong.getText().toString())*1250000;
                    NhanVien nv = new NhanVien(hoten, tuoi, luong );
                    txtvhienthongtin.append(nv.toString());
            }
        });
    }

}

