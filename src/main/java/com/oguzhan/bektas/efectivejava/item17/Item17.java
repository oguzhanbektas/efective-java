package com.oguzhan.bektas.efectivejava.item17;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Item17 {

    /*
    Mutable - Immutable
    Mutable: Bir nesne oluşturulduğunda veya bir obje oluşturulduğunda eğer bu objenin değerini değiştirebiliyorsak bu mutable objedir.
    Immutable tam tersi.
     */


    public static void main(String[] args) {
        String isim = new String("Ozi");
        isim.toLowerCase(Locale.ROOT);
        System.out.println(isim);
        // String immutabledır. Ozi ismi küçük yapamadık.

        //DAte mutabledır değiştirebiliyoruz.
        Date date = new Date();
        System.out.println(date);

        date.setDate(7);
        System.out.println(date);

        // Immutable
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate.plusDays(7);
        System.out.println(localDate);
    }


}
