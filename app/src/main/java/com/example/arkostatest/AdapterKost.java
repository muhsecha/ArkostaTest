package com.example.arkostatest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterKost extends RecyclerView.Adapter<AdapterKost.AdapterKostViewHolder> {

    private ArrayList<ModelKost> datalist;

    public AdapterKost(ArrayList<ModelKost> datalist) {
        this.datalist = datalist;
    }
    @Override
    public AdapterKostViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_kost, parent, false);
        return new AdapterKostViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AdapterKost.AdapterKostViewHolder holder, int position) {
        holder.tv_kostType.setText(datalist.get(position).getKostType());
        holder.tv_kostStars.setText(datalist.get(position).getKostStars());
        holder.tv_kostName.setText(datalist.get(position).getKostName());
        holder.tv_kostLeft.setText(datalist.get(position).getKostLeft());
        holder.tv_kostAdress.setText(datalist.get(position).getKostAddress());
        holder.tv_kostPrice.setText(datalist.get(position).getKostPrice());
        holder.tv_kostPriceDate.setText(datalist.get(position).getKostPricedate());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

    public static class AdapterKostViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_kostType,tv_kostStars,tv_kostName,tv_kostLeft,tv_kostAdress,tv_kostPrice,tv_kostPriceDate;

        public AdapterKostViewHolder(View itemView) {
            super(itemView);
            tv_kostType = (TextView) itemView.findViewById(R.id.tv_kostType);
            tv_kostStars = (TextView) itemView.findViewById(R.id.tv_kostStars);
            tv_kostName = (TextView) itemView.findViewById(R.id.tv_kostName);
            tv_kostLeft = (TextView) itemView.findViewById(R.id.tv_kostLeft);
            tv_kostAdress = (TextView) itemView.findViewById(R.id.tv_kostAddress);
            tv_kostPrice = (TextView) itemView.findViewById(R.id.tv_kostPrice);
            tv_kostPriceDate = (TextView) itemView.findViewById(R.id.tv_kostPriceDate);
        }
    }
}
