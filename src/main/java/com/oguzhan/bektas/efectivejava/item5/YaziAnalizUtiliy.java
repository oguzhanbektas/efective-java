package com.oguzhan.bektas.efectivejava.item5;

public class YaziAnalizUtiliy {

    private YaziAnalizUtiliy() {
    }

    private static final Sozluk turkish = new Sozluk("Türkçe");

    public static boolean isValid() {
        return true;
    }

    public static String upUzunBirMetodAdiYaziyorumSuAnAklimaGelenKelimelerle() {
        return "Hi!";
    }
}
