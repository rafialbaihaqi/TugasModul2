package com.rafialbaihaqi.tugasmodul2.LatihanNo1;

public class DemoClub {
    public static void main(String[] args) {
        //Membuat objek baru
        //objek constructor kosong
        Club bola_1 = new Club();
        //objek dengan constructor 1 parameter nama
        Club bola_2 = new Club("FC Porto");
        //objek constructor 2 parameter nama dan deskripsi
        Club bola_3 = new Club("Ajax", "klub Sepak Bola terbaik saat ini" +
                "di Liga Belanda");
        //objek dengan constructor 3 parameter
        Club bola_4 = new Club("Juventus ", 1903, "Juventus Stadium");
        //objek dengan constructor 5 parameter
        Club bola_5 = new Club("Real Madrid", 1902, "Santiago Bernabeu", 13,
                "Klub pemenang UEFA Champions League terbanyak dan merupakan salah satu klub terkaya di dunia");

        //Output (pemanggilan team)
        bola_1.getTeam();
        bola_2.getTeam();
        bola_3.getTeam();
        bola_4.getTeam();
        bola_5.getTeam();
    }
}
