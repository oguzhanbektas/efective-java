package com.oguzhan.bektas.efectivejava.item27_28;

public class Item27_28 {
    /*
    Eliminate unchecked warnings. 27
    Genelde kod yazarken sarı vs görürüz .Bunların önüne nasıl geçeriz.
    Bir cast operation yaptığımız zaman ben bunun doğruluğu kesin bilmiyorum hata olabilir diye warning veriyor
    Sarılığı yok etmek için @SuppressWarnings("unchecked") yazabiliriz.

     */
    public static void main(String[] args) {
        //28
        //Listleri Dizilere Tercih edin.
//        Object[] objectArray = new Long[1];
//        objectArray[0] = "Yazı yazdım";
//
//        List<Object> objectList=new ArrayList<Long>();// uyumsuz türler
//        objectList.add(1L);

//        Dizilerde Object[] -> Long[] ' un süper sınıfıdır.
//        Ancak List<Object> -> List<String> arasında böyle bir bağlantı söz konusu olmaz. Generic bizi kurtarıyor.
//        Genericleri arraylere tercih edin.

//        arrayler -> run time da tür güvenliği ancak derlemede sağlamaz
//        genericlerde bu durum tam tersi . List tercih edin !

    }
}
