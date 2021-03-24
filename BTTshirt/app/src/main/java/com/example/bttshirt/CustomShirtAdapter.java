package com.example.bttshirt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomShirtAdapter extends BaseAdapter {
    public CustomShirtAdapter(Context ctx, int layoutItem, ArrayList<Tshirt> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }
    Context ctx;
    int layoutItem;
    ArrayList<Tshirt> arrayList;

    @Override
    public int getCount() {
        return arrayList.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(ctx).
                inflate(layoutItem,viewGroup,false);
        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvPrice=view.findViewById(R.id.tvPrice);
        ImageView imgShirt=view.findViewById(R.id.imageShirt);

        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        imgShirt.setImageResource(arrayList.get(i).getImageShirt());

        return view;
    }


}
