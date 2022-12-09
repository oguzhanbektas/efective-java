package com.oguzhan.bektas.efectivejava.item22;

public class Item22 {

    /*
    Item 22 : Use Interfaces only to define types
    Interfaceler sadece tip tanımlerken kullanılmalı

    Doğru interface kullanımı nasıl olmalı ?
     */

    public static void main(String[] args) {

        WrongClass wrongClass = new WrongClass();
        double avogadrosNumber = wrongClass.AVOGADROS_NUMBER;
        // Encapsulate yapısına ve işi yoksa diğer sınıftaki variable lara erişimin olmaması gerekmektedir.
        // PhysicalConstant class ın daki oluşturulması daha doğrudur.

    }
}
