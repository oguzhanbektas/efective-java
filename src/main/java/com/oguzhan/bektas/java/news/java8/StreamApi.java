package com.oguzhan.bektas.java.news.java8;

import java.util.Arrays;

public class StreamApi {

    /*
    Stream API, Collection’lar üzerinde bazı işlemleri yapmayı kolaylaştıran bir yapıdır.
    Stream API sayesinde sık kullanılan çeşitli operasyonları yapabilirsiniz. Bunlardan birkaçını şöyle sıralayabiliriz;
    filter (filtreleme)
    forEach (itere etme)
    map (dönüştürme)
    reduce (indirgeme)
    distinct (tekil hale getirme)
    limit (limitleme)
    collect (toplama)
    count (sayma)
    min / max  (sıralama ile max-min eleman bulma
     */
    public static void main(String[] args) {
        Arrays.asList("ozi","deneme","icin").stream().forEach(System.out::println);
    }
}
