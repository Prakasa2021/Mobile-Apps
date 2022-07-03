package com.udinus.Traditional_Costume_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.udinus.Traditional_Costume_App.R;

public class Login extends AppCompatActivity {

    EditText editNama;
    EditText editAlamat;
    EditText editNomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editNama = findViewById(R.id.namaInput);
        editAlamat = findViewById(R.id.alamatInput);
        editNomor = findViewById(R.id.nomorInput);
    }

    public void formSewa(View view) {
        if(TextUtils.isEmpty(editNama.getText().toString().trim())
                &&
                TextUtils.isEmpty(editAlamat.getText().toString().trim())
                    &&
                    TextUtils.isEmpty(editNomor.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Harap Isi Identitas Anda", Toast.LENGTH_LONG).show();
        }

        else if(TextUtils.isEmpty(editNama.getText().toString().trim())
                &&
                TextUtils.isEmpty(editAlamat.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Nama dan Alamat Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editNama.getText().toString().trim())
                &&
                TextUtils.isEmpty(editNomor.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Nama dan Nomor HP Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editAlamat.getText().toString().trim())
                &&
                TextUtils.isEmpty(editNomor.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Alamat dan Nomor HP Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }

        else if(TextUtils.isEmpty(editNama.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Nama masih kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editAlamat.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Alamat masih kosong!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editNomor.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Nomor HP masih kosong!", Toast.LENGTH_LONG).show();
        }

        else{
            Intent i = new Intent(Login.this, Confirm.class);
            startActivity(i);
        }
    }
}