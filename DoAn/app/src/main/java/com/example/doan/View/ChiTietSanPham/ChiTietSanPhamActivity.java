package com.example.doan.View.ChiTietSanPham;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.doan.Adapter.AdapterDanhGia;
import com.example.doan.Model.ObjectClass.DanhGia;
import com.example.doan.Model.ObjectClass.Data_NoiBat;
import com.example.doan.R;
import com.example.doan.View.DanhGia.DanhSachDanhGiaActivity;
import com.example.doan.View.DanhGia.ThemDanhGiaActivity;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class ChiTietSanPhamActivity extends AppCompatActivity implements View.OnClickListener, viewChiTietSanPham {

    ViewPager viewPager;
    TextView[] txtDots;
    LinearLayout layoutDots;
    List<Data_NoiBat> fragmentList;
    TextView txtTenSanPham, txtGiaTien, txtTenCHDongGoi, txtThongTinChiTiet, txtXemTatCaNhanXet, txtGioHang, txtGiamGia;
    Toolbar toolbar;
    ImageView imXemThemChiTiet, imThemGioHang;
    Button btnMuaNgay;
    LinearLayout lnThongSoKyThuat;
    TextView txtVietDanhGia;
    List<DanhGia> danhGiaList;
    RecyclerView recyclerDanhGiaChiTiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chitietsanpham);

        viewPager = findViewById(R.id.viewpagerSlider);
        layoutDots = findViewById(R.id.layoutDots);
        txtTenSanPham = findViewById(R.id.txtTenSanPham);
        txtGiaTien = findViewById(R.id.txtGiaTien);
        txtGiamGia = findViewById(R.id.txtGiamGia);
        toolbar = findViewById(R.id.toolbar);
        txtThongTinChiTiet = findViewById(R.id.txtThongTinChiTiet);
        imXemThemChiTiet = findViewById(R.id.imXemThemChiTiet);
        lnThongSoKyThuat = findViewById(R.id.lnThongSoKyThuat);
        txtVietDanhGia = findViewById(R.id.txtVietDanhGia);
        recyclerDanhGiaChiTiet = findViewById(R.id.recyclerDanhGiaChiTiet);
        txtXemTatCaNhanXet = findViewById(R.id.txtXemTatCaNhanXet);
        imThemGioHang = findViewById(R.id.imThemGioHang);
        btnMuaNgay = findViewById(R.id.btnMuaNgay);

        txtVietDanhGia.setOnClickListener(this);
        txtXemTatCaNhanXet.setOnClickListener(this);
        imThemGioHang.setOnClickListener(this);
        btnMuaNgay.setOnClickListener(this);
    }

    private int getIdColor(int idcolor) {

        int color = 0;
        if (Build.VERSION.SDK_INT > 21) {
            color = ContextCompat.getColor(this, idcolor);
        } else {
            color = getResources().getColor(idcolor);
        }

        return color;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.txtVietDanhGia:
                Intent iThemDanhGia = new Intent(this, ThemDanhGiaActivity.class);
                startActivity(iThemDanhGia);
                break;

            case R.id.txtXemTatCaNhanXet:
                Intent iDanhSachDanhGia = new Intent(ChiTietSanPhamActivity.this, DanhSachDanhGiaActivity.class);
                startActivity(iDanhSachDanhGia);
                break;
        }
    }

    @Override
    public void HienThiDanhGia(List<DanhGia> danhGiaList) {
        AdapterDanhGia adapterDanhGia = new AdapterDanhGia(this, danhGiaList, 3);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerDanhGiaChiTiet.setLayoutManager(layoutManager);
        recyclerDanhGiaChiTiet.setAdapter(adapterDanhGia);

        adapterDanhGia.notifyDataSetChanged();
    }
}
