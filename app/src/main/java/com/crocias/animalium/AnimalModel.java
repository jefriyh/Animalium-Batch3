package com.crocias.animalium;

/**
 * Created by Jefri Yushendri on 7/5/2017.
 */

public class AnimalModel {

    String namaIndo, namaEng;
    int gambar;

    public String getNamaIndo() {
        return namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public AnimalModel(String namaIndo, String namaEng, int gambar){
        this.namaIndo = namaIndo;
        this.namaEng = namaEng;
        this.gambar = gambar;
    }

}