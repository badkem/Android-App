package com.example.doan.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doan.Model.ObjectClass.Data_NoiBat;
import com.example.doan.R;
import com.example.doan.View.ChiTietSanPham.ChiTietSanPhamActivity;

import java.util.List;

public class AdapterNoiBat extends RecyclerView.Adapter<AdapterNoiBat.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardviewNoiBat;
        ImageView photo_NoiBat;
        TextView txtTieuDeNoiBat;

        public ViewHolder(View itemView) {
            super(itemView);
            cardviewNoiBat = itemView.findViewById(R.id.cardviewNoiBat);
            photo_NoiBat = itemView.findViewById(R.id.photo_NoiBat);
            txtTieuDeNoiBat = itemView.findViewById(R.id.txtTieuDeNoiBat);

        }
    }

    private List<Data_NoiBat> dataNoiBatList;
    private Context context;

    public AdapterNoiBat(Context context, List<Data_NoiBat> dataNoiBatList) {
        this.dataNoiBatList = dataNoiBatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recyclerview_noibat, parent, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data_NoiBat dataNoiBat = dataNoiBatList.get(position);
        holder.txtTieuDeNoiBat.setText(dataNoiBat.getName());
        holder.photo_NoiBat.setImageResource(dataNoiBat.getId_photo());

        holder.cardviewNoiBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iChitietsanpham = new Intent(context, ChiTietSanPhamActivity.class);
                context.startActivity(iChitietsanpham);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataNoiBatList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
