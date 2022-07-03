package com.udinus.Traditional_Costume_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.udinus.Traditional_Costume_App.R;

public class Confirm extends AppCompatActivity {

    EditText editConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        editConfirm = findViewById(R.id.inputKonfirmasi);
    }

    public void formKonfirmasi(View view) {
        if(TextUtils.isEmpty(editConfirm.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Masukkan kode konfirmasi!", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(Confirm.this, Sukses.class);
            startActivity(i);
        }
    }


}