package com.example.androidbasic.list_view.ex_2;

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


public class PersionAdapterView_ex_2 extends BaseAdapter{

    private final Context context;
    private final int layout;
    private final List<PersionModelCustomeView_ex_2> persionsList;

    public PersionAdapterView_ex_2(Context context, int layout, List<PersionModelCustomeView_ex_2> persionsList) {
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

        ImageView imgAvata = view.findViewById(R.id.imgAvata);
        TextView title = view.findViewById(R.id.title);
        TextView content = view.findViewById(R.id.content);
        ImageView imgNation = view.findViewById(R.id.imgNation);

        PersionModelCustomeView_ex_2 persion = persionsList.get(i);

        imgAvata.setImageResource(persion.getImgAvata());
        title.setText(persion.getName());
        content.setText(persion.getSchool());
        imgNation.setImageResource(persion.getImgNation());

        return view;
    }
}
