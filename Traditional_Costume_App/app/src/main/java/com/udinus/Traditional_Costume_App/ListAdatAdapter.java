package com.udinus.Traditional_Costume_App;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.udinus.Traditional_Costume_App.R;

import java.util.ArrayList;

public class ListAdatAdapter extends RecyclerView.Adapter<ListAdatAdapter.ListViewHolder> {
    private ArrayList<Adat> listAdat;

    public OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListAdatAdapter(ArrayList<Adat> list) {
        this.listAdat = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_adat, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdatAdapter.ListViewHolder holder, int position) {
        Adat adat = listAdat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(adat.getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgGambar);
        holder.tvNama.setText(adat.getNama());
        holder.tvHarga.setText(adat.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listAdat.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAdat.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvNama;
        TextView tvHarga;

        ListViewHolder(View itemview) {
            super(itemview);
            imgGambar = itemview.findViewById(R.id.gambarAdat);
            tvNama = itemview.findViewById(R.id.teksAdat);
            tvHarga = itemview.findViewById(R.id.hargaSewa);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Adat data);
    }
}
