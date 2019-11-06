package com.example.dsphim2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PostEntryAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<PostEntry> postentry;

    public PostEntryAdapter(Context context, ArrayList<PostEntry> postentry) {
        this.context = context;
        this.postentry = postentry;
    }

    @Override
    public int getCount() {
        return postentry.size();

    }

    @Override
    public Object getItem(int position) {
        return postentry.get(position);
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
            convertView = inflater.inflate(R.layout.post_entry,null);
            dataitem.txt_id = convertView.findViewById(R.id.post_id);
            dataitem.txt_title = convertView.findViewById(R.id.post_title);
            dataitem.imv_url_photo = convertView.findViewById(R.id.post_imageview);
            dataitem.txt_short_desk = convertView.findViewById(R.id.post_short_desk);
            convertView.setTag(dataitem);
        }else {
            dataitem = (MyView)convertView.getTag();
        }
        dataitem.txt_id.setText("Entry "+postentry.get(position).getId()+"");
        dataitem.txt_title.setText(postentry.get(position).getTitle());
        new DownLoadImage(dataitem.imv_url_photo).execute(postentry.get(position).getUrl_photo());
        dataitem.txt_short_desk.setText(postentry.get(position).getShort_desk());
        return convertView;
    }
    private static class MyView{
        TextView txt_id;
        TextView txt_title;
        ImageView imv_url_photo;
        TextView txt_short_desk;
    }
}
