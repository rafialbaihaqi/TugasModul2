package com.rafialbaihaqi.tugasmodul2.LatihanNo1;

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    //Construktor tanpa parameter
    public Club() {}

    //Constructor dengan 1 parameter tipe data String
    public Club(String nama) {
        this.nama = nama;
    }
    //Constructor dengan 2 parameter tipe data String
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    //Constructor dengan 3 parameter bertipe data String dan int
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }
    //Constructor dengan 5 parameter bertipe data String dan int
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }
    //Method Get Team
    public void getTeam(){
        System.out.println("Club\t\t\t: " + nama);
        System.out.println("Since\t\t\t: " + tahunBerdiri);
        System.out.println("Stadium\t\t\t: " + stadion);
        System.out.println("UCL Champion\t: " + juaraUcl);
        System.out.println("Description\t\t: " + deskripsi);
        System.out.println();
    }
}
