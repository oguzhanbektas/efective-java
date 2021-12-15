package com.oguzhan.bektas.items;

import com.oguzhan.bektas.Starbucks;
import com.oguzhan.bektas.StarbucksBuilder;

public class Item2 {

    /**
     * Consider a builder when faced with many constructor parameters
     */
    public static void main(String[] args) throws Exception {

        // Mesela Kahve satıyoruz size gerekli ama laktoz miktarı yumuşatıcı gibi alanları gerekli değil
        // ama constructor olarak da alınması gerekiyor o yüzden her olasılığın tek tek constructor ı olmak zorunda
        //bu olaya Teleskop pattern deniyor ve kod kalitersi okunabilirliği olumsuz etkiliyor.

        Starbucks sbTeleskopPatterb = new Starbucks("XL");

        // Kitap bize boş contructor oluştur diyor gerekli ise sen ekle diyor.
        // İlk çözüme göre iyi fakat eksiklikleri var . Java Beans Pattern olarak geçiyor.
        Starbucks sbBeansPattern = new Starbucks();
        sbBeansPattern.setSize("XL");
        sbBeansPattern.setAmountOfLactoseFreeMilk("Bol");
        sbBeansPattern.setSoftenerCoffee(true);

        // Builder Pattern
        // Tek eksiği kod tekrarı .
        // Daha güvenli ve daha düzgün bir kullanım aynı zamanda builder içinde extra işlem yapma olanağıda sağlıyor. boş gelme olsalığında throw etme vs..
        StarbucksBuilder builder = new StarbucksBuilder.Builder("Tall").softener(true).lactoseFreeMilk("az").build();

    }
}
