package com.kem.DoAn_Cinema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.app.AlertDialog;


public class trangchu extends AppCompatActivity {


    EditText ten;
    EditText sdt;
    EditText email;
    EditText baprang;
    EditText nuocngot;
    EditText soluongve;

    Switch hoivien;
    Spinner thanhtoan;
    CheckBox a1;
    CheckBox a2;
    CheckBox a3;
    CheckBox a4;
    CheckBox a5;
    CheckBox a6;
    CheckBox b1;
    CheckBox b2;
    CheckBox b3;
    CheckBox b4;
    CheckBox b5;
    CheckBox b6;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;
    CheckBox c5;
    CheckBox c6;
    CheckBox d1;
    CheckBox d2;
    CheckBox d3;
    CheckBox d4;
    CheckBox d5;
    CheckBox d6;
    Button xacnhan;
    Button huy;




    Button xn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        xn = (Button) findViewById(R.id.btnxacnhan);
        xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, HoaDon.class);
                startActivity(intent);
            }
        });

        final int a = 50000;
        final int tbap= 20000;
        final int tnuoc= 20000;

        final EditText ten = (EditText) findViewById(R.id.editTên);
        final EditText sdt = (EditText) findViewById(R.id.editSĐT);
        final EditText email = (EditText) findViewById(R.id.editemail);
        final EditText baprang = (EditText) findViewById(R.id.edbaprang);
        final EditText nuocngot = (EditText) findViewById(R.id.ednuocngot);
        final EditText soluongve = (EditText) findViewById(R.id.edsoluong);
        final Switch hoivien = (Switch) findViewById(R.id.switch2);
        final Spinner thanhtoan = (Spinner) findViewById(R.id.spinner2);
        final Spinner chonphim = (Spinner) findViewById(R.id.spinner);

        final Button huy = (Button) findViewById(R.id.btnhuy);
        final Button xacnhan = (Button) findViewById(R.id.btnxacnhan);

        final CheckBox a1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox a2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox a3 = (CheckBox) findViewById(R.id.checkBox9);
        final CheckBox a4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox a5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox a6 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox b1 = (CheckBox) findViewById(R.id.checkBox20);
        final CheckBox b2 = (CheckBox) findViewById(R.id.checkBox10);
        final CheckBox b3 = (CheckBox) findViewById(R.id.checkBox6);
        final CheckBox b4 = (CheckBox) findViewById(R.id.checkBox11);
        final CheckBox b5 = (CheckBox) findViewById(R.id.checkBox12);
        final CheckBox b6 = (CheckBox) findViewById(R.id.checkBox13);
        final CheckBox c1 = (CheckBox) findViewById(R.id.checkBox24);
        final CheckBox c2 = (CheckBox) findViewById(R.id.checkBox15);
        final CheckBox c3 = (CheckBox) findViewById(R.id.checkBox16);
        final CheckBox c4 = (CheckBox) findViewById(R.id.checkBox17);
        final CheckBox c5 = (CheckBox) findViewById(R.id.checkBox18);
        final CheckBox c6 = (CheckBox) findViewById(R.id.checkBox19);
        final CheckBox d1 = (CheckBox) findViewById(R.id.checkBox32);
        final CheckBox d2 = (CheckBox) findViewById(R.id.checkBox21);
        final CheckBox d3 = (CheckBox) findViewById(R.id.checkBox22);
        final CheckBox d4 = (CheckBox) findViewById(R.id.checkBox25);
        final CheckBox d5 = (CheckBox) findViewById(R.id.checkBox26);
        final CheckBox d6 = (CheckBox) findViewById(R.id.checkBox23);

        xacnhan.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            String msg = "TÊN: " + ten.getText().toString() +
              System.getProperty("line.separator") +
                    "SỐ ĐIỆN THOẠI: " + sdt.getText().toString()
                    + System.getProperty("line.separator") + "EMAIL: " + email.getText().toString();
                     ten.setText("");
                      sdt.setText("");
                       email.setText("");

                       msg += System.getProperty("line.separator") + "PHIM CỦA BẠN LÀ: " +
                                                           chonphim.getSelectedItem().toString();

                    msg +=  System.getProperty("line.separator") +"BẮP RANG (20k/suất): " + baprang.getText().toString() + " suất " + System.getProperty("line.separator") +
                     "NƯỚC NGỌT (20k/suất): " + nuocngot.getText().toString() + " suất " + System.getProperty("line.separator") + "SỐ LƯỢNG VÉ(50k/vé): " + soluongve.getText().toString() + " VÉ" ;
                         msg += System.getProperty("line.separator") + "HỘI VIÊN: ";

                           if(hoivien.isChecked())
                               msg += "Có";
                                 else
                               msg += "Không";
                                 msg += System.getProperty("line.separator") + "KIỂU THANH TOÁN: " +
                                                           thanhtoan.getSelectedItem().toString();

                               msg += System.getProperty("line.separator") + "GHẾ ĐÃ CHỌN: ";

                                if(a1.isChecked())
                                     msg +=  a1.getText().toString()+ ", ";
                                if(a2.isChecked())
                                      msg += a2.getText().toString() + ", ";
                                if(a3.isChecked())
                                        msg += a3.getText().toString()+ ",  ";
                                if(a4.isChecked())
                                       msg +=  a4.getText().toString()+ ", ";
                                  if(a5.isChecked())
                                      msg += a5.getText().toString() + ", ";
                                  if(a6.isChecked())
                                       msg += a6.getText().toString()+ ",  ";

                                   if(b1.isChecked())
                                       msg +=  b1.getText().toString()+ ", ";
                                   if(b2.isChecked())
                                       msg += b2.getText().toString() + ", ";
                                        if(b3.isChecked())
                                                       msg += b3.getText().toString()+ ",  ";
                                                   if(b4.isChecked())
                                                       msg +=  b4.getText().toString()+ ", ";
                                                   if(b5.isChecked())
                                                       msg += b5.getText().toString() + ", ";
                                                   if(b6.isChecked())
                                                       msg += b6.getText().toString()+ ",  ";

                                                   if(c1.isChecked())
                                                       msg +=  c1.getText().toString()+ ", ";
                                                   if(c2.isChecked())
                                                       msg += c2.getText().toString() + ", ";
                                                   if(c3.isChecked())
                                                       msg += c3.getText().toString()+ ",  ";
                                                   if(c4.isChecked())
                                                       msg +=  c4.getText().toString()+ ", ";
                                                   if(c5.isChecked())
                                                       msg += c5.getText().toString() + ", ";
                                                   if(c6.isChecked())
                                                       msg += c6.getText().toString()+ ",  ";
                                                   if(d1.isChecked())
                                                       msg += d1.getText().toString()+ ",  ";
                                                   if(d2.isChecked())
                                                       msg += d2.getText().toString()+ ",  ";
                                                   if(d3.isChecked())
                                                       msg += d3.getText().toString()+ ",  ";
                                                   if(d4.isChecked())
                                                       msg += d4.getText().toString()+ ",  ";
                                                   if(d5.isChecked())
                                                       msg += d5.getText().toString()+ ",  ";
                                                   if(d6.isChecked())
                                                       msg += d6.getText().toString()+ ",  ";

                                                   a1.setChecked(false);
                                                   a2.setChecked(false);
                                                   a3.setChecked(false);
                                                   a4.setChecked(false);
                                                   a5.setChecked(false);
                                                   a6.setChecked(false);
                                                   b1.setChecked(false);
                                                   b2.setChecked(false);
                                                   b3.setChecked(false);
                                                   b4.setChecked(false);
                                                   b5.setChecked(false);
                                                   b6.setChecked(false);
                                                   c1.setChecked(false);
                                                   c2.setChecked(false);
                                                   c3.setChecked(false);
                                                   c4.setChecked(false);
                                                   c5.setChecked(false);
                                                   c6.setChecked(false);
                                                   d1.setChecked(false);
                                                   d2.setChecked(false);
                                                   d3.setChecked(false);
                                                   d4.setChecked(false);
                                                   d5.setChecked(false);
                                                   d6.setChecked(false);

            int thanhtien;
            int slve = Integer.parseInt(soluongve.getText().toString());
            int slbap = Integer.parseInt(baprang.getText().toString());
            int slnuoc = Integer.parseInt(nuocngot.getText().toString());
            if (baprang.getText().toString()=="" && nuocngot.getText().toString()=="") {
                if (nuocngot.getText().toString()=="")
                {
                    thanhtien = (50000*slve) + (20000*slnuoc);
                    msg += System.getProperty("line.separator") + "THÀNH TIỀN : "+ thanhtien;
                }
                else if (baprang.getText().toString()=="")
                {
                    thanhtien = (50000*slve) + (20000*slbap);
                    msg += System.getProperty("line.separator") + "THÀNH TIỀN : "+ thanhtien;
                }
                else {
                    thanhtien = (50000*slve);
                    msg += System.getProperty("line.separator") + "THÀNH TIỀN : "+ thanhtien;
                }
            }
            else {
                thanhtien = (50000*slve)+ (20000*slbap) + (20000*slnuoc);
                msg += System.getProperty("line.separator") + "THÀNH TIỀN : "+ thanhtien +" VND";
            }
            info(v, msg);
         }
        }
        );
        huy.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View v) {
                                             cancel(v);
                                         }
                                     }
        );
    }
    public void cancel(View v) {
        System.exit(0);
    }

    public void info(View v, String msg) {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("VÉ CỦA BẠN");
        dlgAlert.setPositiveButton("CHẤP NHẬN", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }
}
