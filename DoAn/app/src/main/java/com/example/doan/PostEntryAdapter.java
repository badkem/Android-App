package com.example.doan;

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
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyView dataItem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            dataItem = new MyView();
            convertView = inflater.inflate(R.layout.activity_post, null);
            dataItem.txt_id = convertView.findViewById(R.id.post_id);
            dataItem.txt_title = convertView.findViewById(R.id.post_title);
            dataItem.imv_url_photo = convertView.findViewById(R.id.post_imageview);
            dataItem.txt_short_desc = convertView.findViewById(R.id.post_short_desc);
            convertView.setTag(dataItem);
        } else {
            dataItem = (MyView) convertView.getTag();
        }
        dataItem.txt_id.setText("#Entry" + postentry.get(position).getId() + "");
        dataItem.txt_title.setText(postentry.get(position).getTitle() + "");
        new DownloadImage(dataItem.imv_url_photo).execute(postentry.get(position).getUrl_photo());
        dataItem.txt_short_desc.setText(postentry.get(position).getShort_desc());
        return convertView;
    }

    private static class MyView {
        TextView txt_id;
        TextView txt_title;
        ImageView imv_url_photo;
        TextView txt_short_desc;
    }
}
