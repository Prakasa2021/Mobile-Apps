package com.udinus.Traditional_Costume_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.udinus.Traditional_Costume_App.R;

public class DetailAdat extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_adat);

        ImageView imgAdat = findViewById(R.id.imgAdat);
        TextView namaPakaian = findViewById(R.id.namaPakaian);
        TextView hargaPakaian = findViewById(R.id.hargaPakaian);

        Adat adat = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(adat != null){
            Glide.with(this)
                    .load(adat.getGambar())
                    .into(imgAdat);
            namaPakaian.setText(adat.getNama());
            hargaPakaian.setText(adat.getHarga());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public void formPemesanan(View view) {
        Intent i = new Intent(DetailAdat.this, Login.class);
        startActivity(i);
    }
}