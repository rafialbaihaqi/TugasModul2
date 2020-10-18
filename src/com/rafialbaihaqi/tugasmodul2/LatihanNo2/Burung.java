package com.rafialbaihaqi.tugasmodul2.LatihanNo2;
//kelas Burung diwarisi oleh kelas Hewan
public class Burung extends Hewan {
    //Deklarasi Variabel
    public String nama_burung;

    //Constructor pertama dengan parameter bertipe data String
    public Burung(String nama_burung) {
        this.nama_burung = nama_burung;
    }

    //annotation override dengan method get nama  hewan
    @Override
    public void getNama(){
        System.out.println("Nama Burung\t\t\t\t: " + nama_burung);
    }

    //Method
    public void getTerbang(){
        System.out.println("Burung Garuda besar terbang biasanya mencari makan untuk anaknya");
        System.out.println();
    }
}
