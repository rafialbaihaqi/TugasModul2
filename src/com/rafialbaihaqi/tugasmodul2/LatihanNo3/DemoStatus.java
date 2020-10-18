package com.rafialbaihaqi.tugasmodul2.LatihanNo3;
//kelas main
public class DemoStatus {
    public static void main(String[] args) {
        Mahasiswa $mahasiswa= new Mahasiswa("Ayu", "4 years", "Virki", "Resmi Pacaran", 6);
        Namapacar $namapacar = new Mahasiswa("Nida", "2 years", "Vardi","Pacaran", 2);

        $mahasiswa.getStatus();
        $namapacar.getStatus();
    }
}
