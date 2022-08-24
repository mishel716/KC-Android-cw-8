package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class itemmm extends ArrayAdapter {
    List<Item>itemList;


    public itemmm(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemList =objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.itemm,parent,false);
        Item itemNow=itemList.get(position);

        TextView itemNamee=view.findViewById(R.id.namee);
        TextView itemPrrice=view.findViewById(R.id.price);
        ImageView itemImgg = view.findViewById(R.id.imageView4);
        ImageView delete = view.findViewById(R.id.imageView2);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemList.remove(position);
                notifyDataSetChanged();
            }
        });

        itemNamee.setText(itemNow.getItemName());
        itemPrrice.setText(String.valueOf(itemNow.getItemPrice()));
        itemImgg.setImageResource(itemNow.getItemImg());
        return view;

    }
}
