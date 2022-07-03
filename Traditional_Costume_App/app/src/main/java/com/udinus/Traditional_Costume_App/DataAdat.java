package com.udinus.Traditional_Costume_App;

import com.udinus.Traditional_Costume_App.R;

import java.util.ArrayList;

public class DataAdat {
    private static String[] namaAdat = {
            "Kebaya", "Jawi Jangkep", "Kanigaran", "Basahan", "Surjan", "Beskap", "Batik", "Jarik", "Kemben", "Cak/Ning",
            "Mantenan", "Pesa'an", "Rancongan", "Bedahan", "Kebaya DIY", "Menak", "Mojang Jajaka"
    };

    private static String[] hargaAdat = {
            "Rp200.000", "Rp220.000", "Rp275.000", "Rp300.000", "Rp175.000", "Rp250.000", "Rp180.000", "Rp175.000", "Rp150.000",
            "Rp280.000", "Rp320.000", "Rp200.000", "Rp230.000", "Rp250.000", "Rp220.000", "Rp275.000", "Rp230.000"
    };

    private static int[] gambarAdat = {
            R.drawable.kebaya,
            R.drawable.jangkep,
            R.drawable.kanigaran,
            R.drawable.basahan,
            R.drawable.surjan,
            R.drawable.beskap,
            R.drawable.batik,
            R.drawable.jarik,
            R.drawable.kemben,
            R.drawable.cakning,
            R.drawable.mantenan,
            R.drawable.pesaan,
            R.drawable.rancongan,
            R.drawable.bedahan,
            R.drawable.kebayadiy,
            R.drawable.menak,
            R.drawable.mojangjajaka,
    };

    static ArrayList<Adat> getListData(){
        ArrayList<Adat> list = new ArrayList<>();
        for (int position = 0; position <namaAdat.length; position++){
            Adat adat = new Adat();
            adat.setNama(namaAdat[position]);
            adat.setHarga(hargaAdat[position]);
            adat.setGambar(gambarAdat[position]);
            list.add(adat);
        }
        return list;
    }
}

