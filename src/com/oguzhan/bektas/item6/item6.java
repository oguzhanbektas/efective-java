package com.oguzhan.bektas.item6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class item6 {

    private static long topla() {
        //Wrapper sınıfı
//        Long sum = 0L;
        //Primitive sınıfı
        long sum = 0L;

        for (int i = 0; i < 150; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * Avoid craeting unncecessary Objects
     * Gereksiz Object yaratmamak.Çok fazla kişiye hizmet eden uygulamanız var ise gereksiz obje yaratımı çok ise
     * bellek ve hız konusunda çok sıkıntı yaşayabiliriz.
     * <p>
     * RegExample için de roman sayılarını kontrol eden static bir metodumuz var. Çok masum ve doğru kullanım gibi duruyor.
     */
    public static void main(String[] args) {

        String word = new String("bikini");
        String word2 = "bikini";
        String word3 = "bikini";

        // Bu ikisini farkı ne ?

        System.out.println(word == word2);
        System.out.println(word3 == word2);

        long start = System.nanoTime();
        topla();
        long end = System.nanoTime();
        System.out.println(end - start);

        //Wrapper yani Long daha uzun sürüyor.


        // Autoboxing-Unboxing

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
            // Yukarıdaki işlem aslında
            // integers.add(Integer.valueOf(i));
        }

        // Yukarıdaki yavaşlığın sebebi dönüşümlerdir.
        // int Value kullanımaz ise Wrapper olduğu için dönüşüm sıkıntısı zaman anlamında oluyor.
        List<Integer> li = new ArrayList<>();
        int sum2 = 0;
        for (Integer i : li) {

            if (i.intValue() % 2 == 0) {

            }
        }

    }
}
