package com.rafialbaihaqi.tugasmodul2.LatihanNo2;
//kelas main untuk membuat objek dari perilaku kelas hewan
public class DemoHewan {
    public static void main(String[] args) {
        Burung $bird = new Burung("Garuda");
        $bird.getNama();
        $bird.getPerilaku("Daging", "Pada malam hari");
        $bird.getTerbang();

        Ikan $fish = new Ikan("lele");
        $fish.getNama();
        $fish.getPerilaku("Pelet", "Di air");
        $fish.getRenang();

        Kucing $cat = new Kucing("Puss");
        $cat.getNama();
        $cat.getPerilaku("ikan", "di kursi");
        $cat.getSuara();
    }
}
