package com.oguzhan.bektas.efectivejava.item9_10;

public class Item9 {

    /**
     * Prefer try-with-resources to try-finally
     * Belirli yerlerde try-with-resources yapısı kullanın diyor. Java 7 ile birlikte geldi.
     *
     * ItemEightTest.java da örnekleri yazıldı. Try ın içine alınca finally de kapatma zorunluluğum kalkıyor try dan çıkınca try bloğunda verdiğimiz
     * parametleri otomatiken close yapıyor.
     * 1 ve 2. örneklere bakılabilir.
     * Bir diğer artısı 3.ve 4. örneklerdeki gibi çoklu parametre alabiliyor bu da kod kirliliğinden ve kontrol kolaylığı sağlıyor.
     */

    public static void main(String[] args) {

    }
}
