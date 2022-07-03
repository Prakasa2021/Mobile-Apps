package com.udinus.Traditional_Costume_App;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.udinus.Traditional_Costume_App.R;

import java.util.ArrayList;

public class Beranda extends AppCompatActivity {
    private RecyclerView recyclerAdat;
    private ArrayList<Adat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        recyclerAdat = findViewById(R.id.recyclerAdat);
        recyclerAdat.setHasFixedSize(true);

        list.addAll(DataAdat.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        recyclerAdat.setLayoutManager(new LinearLayoutManager(this));
        ListAdatAdapter listAdatAdapter = new ListAdatAdapter(list);
        recyclerAdat.setAdapter(listAdatAdapter);

        listAdatAdapter.setOnItemClickCallback(new ListAdatAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Adat adat) {
                Intent moveIntent = new Intent(Beranda.this, DetailAdat.class);
                moveIntent.putExtra(DetailAdat.ITEM_EXTRA, adat);
                startActivity(moveIntent);
            }
        });
    }
}