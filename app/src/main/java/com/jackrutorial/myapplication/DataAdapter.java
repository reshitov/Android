package com.jackrutorial.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Food> foods;

    DataAdapter(Context context, List<Food> foods) {
        this.foods = foods;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.macket, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Food food = foods.get(position);
        holder.imageView.setImageResource(food.get_idImage());
        holder.nameView.setText(food.getvTitle());
        holder.companyView.setText(food.getvName());

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, companyView;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.iv_food);
            nameView = (TextView) view.findViewById(R.id.tv_title);
            companyView = (TextView) view.findViewById(R.id.tv_descr);
        }
    }
}
