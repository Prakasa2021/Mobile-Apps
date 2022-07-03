package com.udinus.Traditional_Costume_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.Traditional_Costume_App.R;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void formPakaian(View view) {
        Intent i = new Intent(Dashboard.this, Beranda.class);
        startActivity(i);
    }
    public void formTentang(View view) {
        Intent i = new Intent(Dashboard.this, Tentang.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}