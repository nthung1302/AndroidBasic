package com.example.androidbasic.GridViews.CustomListView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidbasic.R;

import java.util.ArrayList;

public class PersionAdapterGridView_ex_1 extends BaseAdapter {
    private final Context context;
    private final int layout;
    private final ArrayList<PersionModelGridView_ex_1> persionList;

    public PersionAdapterGridView_ex_1(Context context, int layout, ArrayList<PersionModelGridView_ex_1> persionList) {
        this.context = context;
        this.layout = layout;
        this.persionList = persionList;
    }

    @Override
    public int getCount() {
        return persionList.size();
    }

    @Override
    public Object getItem(int position) {
        return persionList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.avata = view.findViewById(R.id.picture);
            holder.title = view.findViewById(R.id.title);
            holder.content = view.findViewById(R.id.content);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }


        PersionModelGridView_ex_1 persion = persionList.get(i);
        holder.avata.setImageResource(persion.getAvata());
        holder.title.setText(persion.getName());
        holder.content.setText(persion.getSchool());

        return view;
    }

    private static class ViewHolder {
        ImageView avata;
        TextView title;
        TextView content;
    }
}
