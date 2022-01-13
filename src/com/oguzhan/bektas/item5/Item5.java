package com.oguzhan.bektas.item5;

import java.util.function.Supplier;

public class Item5 {

    /**
     * Dependency Injection
     * Temel problemimiz Bir tane sözlüğümüz var . Bu sözlük String olarak bir tane dil nesenesi alıyor.
     * Amacımız yazı analizi yapmak.Rusça da Türkçe de bu ifade doğru yazıldı mı ?
     * Bunu Utiliy class ile mi yapmalıyım Singleton ile mi yapmalıyım yoksa DI ile mi yapmalıyız.
     * Utility yani yardımcı sınıflarımızın özelliği private constructor çünkü utility class ın initialize edilmesi istenmiyor
     * YaziAnalizUtiliy.isValid(); esneklik sıfır YaziAnalizUtilty içinde ne tanılmı ise ona göre çalışıyor. Direk elendi.
     * <p>
     * Singleton deneyelim . Onun temel prensibi neydi ?
     * private bir constructor . Tek bir instance olucak ve onun üzerinden çalışacak.Mecbur sınıfın içinde new lenmesi gerekmektedir.
     * YaziAnaliziSingleton.INSTANCE.isValid();
     * Temel olarak utility ile aynı olduğu için bu da patlıyor. Kitap bu yoldan gitmiş.
     * <p>
     * Dependency injection sayesinde esneklik sağlanmış oldu.
     * Winner DI.
     * <p>
     * Java8 ile birlikte Lumbda funcitonlar var . Supplier lar var artık.
     */
    public static void main(String[] args) {

        //Sadece Türkçe için çalışacak esneklik 0.
        YaziAnalizUtiliy.isValid();
        YaziAnaliziSingleton.INSTANCE.isValid();

        // YaziAnaliziDependencyInjection injection = new YaziAnaliziDependencyInjection(new Sozluk("turkish"));

        // Lambda Function
        Supplier<String> fs = () -> "Ozi";
        fs.get();

        Supplier<Sozluk> turkish = () -> new Sozluk("tuskih");
        YaziAnaliziDependencyInjection injection = new YaziAnaliziDependencyInjection(turkish);

        // Görüntü konusunda + sı var ama compiler vs artısı var mı bilmiyorum.

        // Utility üzerinden gidelim ve upuzun isimli bir metod olsun içinde.

        YaziAnalizUtiliy.upUzunBirMetodAdiYaziyorumSuAnAklimaGelenKelimelerle();

        Supplier<String> dahaKisa = () -> YaziAnalizUtiliy.upUzunBirMetodAdiYaziyorumSuAnAklimaGelenKelimelerle();

        dahaKisa.get();

        double randomSayi = Math.random();
        System.out.println(randomSayi);
        System.out.println(randomSayi);

        // Ne zaman yeni değer bekliyorsak Math Random u bir daha yazmak gerekecekti. Supplier la yapsaydık.

        Supplier<Double> randomSupp = () -> Math.random();

        System.out.println(randomSupp.get());
        System.out.println(randomSupp.get());

    }
}
