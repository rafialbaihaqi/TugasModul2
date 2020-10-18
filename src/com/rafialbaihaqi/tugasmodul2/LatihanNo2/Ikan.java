package com.rafialbaihaqi.tugasmodul2.LatihanNo2;
//kelas ikan diwarisi kelas Hewan
public class Ikan extends Hewan {

    public String nama_ikan;
    public Ikan(String namaikan){
        this.nama_ikan= namaikan;
    }

    //annotation override dengan method get nama  hewan
    @Override
    public void getNama(){
        System.out.println("Nama Ikan\t\t\t\t: " + nama_ikan);
    }

    public void getRenang(){
        System.out.println(nama_ikan + " ikan biasanya berenanag ke tidak beraturan ");
        System.out.println();
    }
}
