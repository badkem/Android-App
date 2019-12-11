package com.example.doan.View.DanhGia;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.doan.Adapter.AdapterDanhGia;
import com.example.doan.Model.ObjectClass.DanhGia;
import com.example.doan.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DanhSachDanhGiaActivity extends AppCompatActivity {
    RecyclerView recyclerDanhSachDanhGia;
    ProgressBar progressBar;
    List<DanhGia> tatcadanhgia;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_danhsachdanhgia);

        recyclerDanhSachDanhGia = findViewById(R.id.recyclerDanhSachDanhGia);
        progressBar = findViewById(R.id.progress_bar);

        List<DanhGia> tatcadanhgia = new ArrayList<>();
        tatcadanhgia.add(new DanhGia("Kem","Hàng chất lượng tốt", "Hàng đẹp và chất lượng lắm","10/12/2019",5));
        tatcadanhgia.add(new DanhGia("Kem","Hàng chất lượng tốt", "Hàng đẹp và chất lượng lắm","10/12/2019",5));
        tatcadanhgia.add(new DanhGia("Kem","Hàng chất lượng tốt", "Hàng đẹp và chất lượng lắm","10/12/2019",5));
        tatcadanhgia.add(new DanhGia("Kem","Hàng chất lượng tốt", "Hàng đẹp và chất lượng lắm","10/12/2019",5));

    }

    public void HienThiDanhSachDanhGiaTheoSanPham(List<DanhGia> danhGiaList) {
        tatcadanhgia.addAll(danhGiaList);
        AdapterDanhGia adapterDanhGia = new AdapterDanhGia(this,tatcadanhgia,0);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerDanhSachDanhGia.setLayoutManager(layoutManager);
        recyclerDanhSachDanhGia.setAdapter(adapterDanhGia);
        adapterDanhGia.notifyDataSetChanged();
    }
}
