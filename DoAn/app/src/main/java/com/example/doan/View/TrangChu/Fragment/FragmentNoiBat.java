package com.example.doan.View.TrangChu.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doan.Adapter.AdapterNoiBat;
import com.example.doan.Model.ObjectClass.Data_NoiBat;
import com.example.doan.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentNoiBat extends Fragment {
    RecyclerView recyclerView;
    AdapterNoiBat adapterNoiBat;

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_noibat, container, false);

        List<Data_NoiBat> list = new ArrayList<>();
        list.add(new Data_NoiBat("Iphone 6 Plus", R.drawable.iphone6plus));
        list.add(new Data_NoiBat("Tay cầm Xbox", R.drawable.taycamxbox));
        list.add(new Data_NoiBat("Iphone 6 Black", R.drawable.iphone6black));
        list.add(new Data_NoiBat("Đồng hồ thông ", R.drawable.donghothongminh));
        list.add(new Data_NoiBat("Tay cầm chơi game bluetooth", R.drawable.taycamchoigame));
        list.add(new Data_NoiBat("Gậy chụp hình ", R.drawable.gaychuphinhtusuong));
        list.add(new Data_NoiBat("Loa Sony Electronic ", R.drawable.loasony));
        list.add(new Data_NoiBat("Màn hình máy tính", R.drawable.manhinh));

        recyclerView = view.findViewById(R.id.recyleNoiBat);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);

        recyclerView.setLayoutManager(layoutManager);
        adapterNoiBat = new AdapterNoiBat(getContext(), list);
        recyclerView.setAdapter(adapterNoiBat);

        return view;
    }

}
