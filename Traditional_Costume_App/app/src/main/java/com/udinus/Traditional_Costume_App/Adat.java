package com.udinus.Traditional_Costume_App;

import android.os.Parcel;
import android.os.Parcelable;

public class Adat implements Parcelable {
    private String nama;
    private String harga;
    private int gambar;

    public Adat(){

    }

    protected Adat(Parcel in) {
        nama = in.readString();
        harga = in.readString();
        gambar = in.readInt();
    }

    public static final Creator<Adat> CREATOR = new Creator<Adat>() {
        @Override
        public Adat createFromParcel(Parcel in) {
            return new Adat(in);
        }

        @Override
        public Adat[] newArray(int size) {
            return new Adat[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(harga);
        parcel.writeInt(gambar);
    }
}
