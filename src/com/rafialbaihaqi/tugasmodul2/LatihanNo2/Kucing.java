package com.rafialbaihaqi.tugasmodul2.LatihanNo2;

public class Kucing extends Hewan {
    //Deklarasi Variabel
    public String nama_kucing;

    //Constructor parameter tipe data String
    public Kucing(String nama_kucing) {
        this.nama_kucing = nama_kucing;
    }

    //annotation override dengan method get nama  hewan
    @Override
    public void getNama(){
        System.out.println("Nama Kucing\t\t\t\t: " + nama_kucing);
    }
    public void getSuara(){
        System.out.println(nama_kucing + " mengeong ketika mencari meminta makanan");
        System.out.println();
    }
}
