package com.example.tugasrumah4_recycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ApplAdapter extends RecyclerView.Adapter<ApplAdapter.ApplViewHolder>{
    private ArrayList<Appl> dataList;
    public ApplAdapter(ArrayList<Appl> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ApplAdapter.ApplViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_app, parent, false);
        return new ApplViewHolder(view);
    }
    public void onBindViewHolder(ApplViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtKeterangan.setText(dataList.get(position).getKeterangan());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ApplViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtKeterangan;
        private ImageView Logo;
        public ApplViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtKeterangan = (TextView)
                    itemView.findViewById(R.id.txt_keterangan);
        }
    }
}
