package com.example.dsphim2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Category> categories;

    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyView dataitem;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView==null){
            dataitem = new MyView();
            convertView = inflater.inflate(R.layout.categories,null);
            dataitem.ten_dm = convertView.findViewById(R.id.ten_dm);
            dataitem.imv_url_photo = convertView.findViewById(R.id.imv_dm);
            convertView.setTag(dataitem);
        }else {
            dataitem = (MyView)convertView.getTag();
        }
        dataitem.ten_dm.setText(categories.get(position).getTen_dm());
        new DownLoadImage(dataitem.imv_url_photo).execute(categories.get(position).getUrl_photo());
        return convertView;
    }
    private static class MyView{
        ImageView imv_url_photo;
        TextView ten_dm;
    }
}
