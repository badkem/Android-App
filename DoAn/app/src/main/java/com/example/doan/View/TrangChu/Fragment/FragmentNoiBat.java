package com.example.doan.View.TrangChu.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doan.Adapter.AdapterNoiBat;
import com.example.doan.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentNoiBat extends Fragment {
    RecyclerView recyclerView;
    AdapterNoiBat adapterNoiBat;


    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_noibat,container,false);

        recyclerView = view.findViewById(R.id.recyleNoiBat);
        List<String> dulieu = new ArrayList<>();


        for (int i=0 ;i<100;i++){
            String ten = " Noi bat " + i;
            dulieu.add(ten);
        }

//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),3);
        adapterNoiBat = new AdapterNoiBat(getActivity(),dulieu);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterNoiBat);

        adapterNoiBat.notifyDataSetChanged();
        return view;
    }
}
