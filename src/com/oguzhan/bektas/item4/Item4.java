package com.oguzhan.bektas.item4;


import java.util.Collections;

public class Item4 {

    /**
     * Java Utility Classes & Abstract Utility Mantıklı mı?
     * <p>
     * Mesela Collections gibi projenin neredeyse heryerinde kullanabileceğimiz ortak fonksiyonlar vardır .
     * Sadece metod içerdiği için bu sınıfın nesnesini oluşturmak mantıklı değil.
     * Oluşturmamak için constructor ı private olarak yapılmış.Ve içerisinde de static metodları var .
     * Genel olarak Utility Classların içermesi gereken şeyler private constructor ve static metodlar.
     * private constructor oluşturun ve içinde de throw attırın.
     * <p>
     * org.springframework.util.StringUtils
     * Bu bir abstract class . Intance yaratılamıyor. Bu doğru yaklaşım değil.
     * Buradaki olay DenemeAbs instance oluşturulamıyor fakat DenemeNormal e extends edilebiliyor. DenemeNormal normal class olduğu için
     * aşağıdaki şekilde instance ı oluşturulabiliyor.
     * <p>
     * Enum olarak oluşturularak da Collection gibi oluşturulup çağrılabilir.
     */

    public static void main(String[] args) {

        DenemeNormal d = new DenemeNormal();
        // Bu şekilde oluşturabiliryor.
        //DenemeNormal de extends olarak DenemeAbs yi alıyor yani metodlarına erişme imkanımız oluyor.

        Enum.topla();

    }

}
