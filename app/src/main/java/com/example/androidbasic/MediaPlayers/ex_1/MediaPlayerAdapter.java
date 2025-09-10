package com.example.androidbasic.MediaPlayers.ex_1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidbasic.R;

import java.util.ArrayList;

public class MediaPlayerAdapter extends BaseAdapter {
    private final Context context;
    private final int layout;
    private final ArrayList<MP3> arrayList;

    public MediaPlayerAdapter(Context context, int layout, ArrayList<MP3> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    private static class ViewHolder {
        ImageView image;
        TextView title;
        TextView content;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null){
            holder = new MediaPlayerAdapter.ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.image = view.findViewById(R.id.picture);
            holder.title = view.findViewById(R.id.title);
            holder.content = view.findViewById(R.id.content);

            view.setTag(holder);
        } else {
            holder = (MediaPlayerAdapter.ViewHolder) view.getTag();
        }


        MP3 mp3 = arrayList.get(i);
        holder.image.setImageResource(mp3.getImage());
        holder.title.setText(mp3.getTitle());
        holder.content.setText(mp3.getContent());
        return view;
    }
}
