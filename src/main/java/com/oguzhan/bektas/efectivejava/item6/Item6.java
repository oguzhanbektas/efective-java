package com.oguzhan.bektas.efectivejava.item6;

import java.util.ArrayList;
import java.util.List;

public class Item6 {

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

    private static long toplaWrapper() {
        //Wrapper sınıfı
        Long sum = 0L;
        //Primitive sınıfı
//        long sum = 0L;

        for (int i = 0; i < 150; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * Java Boxing Autoboxing Unboxing
     * Wrapper --> Java’da 8 adet primitive değişken bulunmaktadır.Java’da Wrapper’lar konusu gelince aklımıza gelmesi gereken şey primitive değişkenlerimizin Class’larıdır.
     * AUTOBOXING --> Primitive bir değişkenin wrapper sınıf tipine otomatik olarak dönüştürme işlemine denir.
     * Integer number = 100; //Wrapper Class <- pritimive variable
     * BOXING --> Primitive değişkeni wrapper sınıfına dönüştürme işlemidir fakat burada constructor yardımı ile gerçekleştirmiş olacağız.
     * Integer number = new Integer(100); //Integer Constructor yardımı ile gönderdik.
     * UNBOXING --> Bu işlemi Integer Sınıfındaki intValue metotu ile gerçekleştireceğiz.Bu metot ile Integer sınıfındaki değişkenin int primitive tipindeki değerini bize döndürür.
     * Integer number = 250;
     * int unboxing = number.intValue();
     *
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
        System.out.println("Tür Dönüşümsüz --> " + (end - start));

        long startWrapper = System.nanoTime();
        toplaWrapper();
        long endWrapper = System.nanoTime();
        System.out.println("Tür Dönüşümlü --> " + (endWrapper - startWrapper));

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

//            if (i % 2 == 0) {
            if (i.intValue() % 2 == 0) {

            }
        }

        int a = 2;

        Integer d = Integer.valueOf(2);

    }
}
