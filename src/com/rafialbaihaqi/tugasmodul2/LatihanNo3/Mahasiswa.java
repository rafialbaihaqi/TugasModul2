package com.rafialbaihaqi.tugasmodul2.LatihanNo3;
//kelas mahasiswa dengan perilaku vmi ke kelas pacar
public class Mahasiswa extends Namapacar {
    public String nama, status;
    public int semester;

    public Mahasiswa(String namapacar, String berapalama, String nama, String status, int semester) {
        super(namapacar, berapalama);
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }
    public void getStatus(){
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Status\t\t\t: " + status);
        System.out.println("Semester\t\t: " + semester);
        System.out.println("Nama Pacar\t\t: " + namapacar);
        System.out.println("Lama Hubungan\t: " + berapalama);
        System.out.println();
    }
}

