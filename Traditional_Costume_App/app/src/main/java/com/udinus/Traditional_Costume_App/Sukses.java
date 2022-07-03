package com.udinus.Traditional_Costume_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.Traditional_Costume_App.R;

public class Sukses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses);
    }

    public void kembaliBeranda(View view) {
        Intent i = new Intent(Sukses.this, Dashboard.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}