package com.example.androidbasic.ListViews.ex_1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidbasic.R;

import java.util.List;


public class PersionAdapterListView_ex_1 extends BaseAdapter{

    private final Context context;
    private final int layout;
    private final List<PersionModelListView_ex_1> persionsList;

    public PersionAdapterListView_ex_1(Context context, int layout, List<PersionModelListView_ex_1> persionsList) {
        this.context = context;
        this.layout = layout;
        this.persionsList = persionsList;
    }

    @Override
    public int getCount() {
        return persionsList.size();
    }

    @Override
    public Object getItem(int position) {
        return persionsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        ImageView img = view.findViewById(R.id.picture);
        TextView title = view.findViewById(R.id.title);
        TextView content = view.findViewById(R.id.content);

        PersionModelListView_ex_1 persion = persionsList.get(i);
        img.setImageResource(persion.getImage());
        title.setText(persion.getName());
        content.setText(persion.getSchool());
        return view;
    }
}
