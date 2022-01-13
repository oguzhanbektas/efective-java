package com.oguzhan.bektas.efectivejava.item5;

public class YaziAnaliziSingleton {

    private YaziAnaliziSingleton() {
    }

    public static YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();

    private static final Sozluk turkish = new Sozluk("Türkçe");

    public static boolean isValid() {
        return true;
    }
}
