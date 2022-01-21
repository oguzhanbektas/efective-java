package com.oguzhan.bektas.efectivejava.item8;

public class Item8 {


    /**
     * Avaoid finalizers and cleaners
     * <p>
     * Finalizers ve cleaner Garbage Collection ile birlikte çalışan temizleme aksiyonu alırken nesneleri referansına bakıp
     * complex algoritmalar döndüren sistemdir. İki tane termilojidir.
     * <p>
     * Finalizers tahmin edilemez , sıklıkla tehlikeli ve genellikle de gereksizdir. Java 9 ile birlikte dublicate oluyor ve yerini Cleaners a bırakıyor.
     * <p>
     * Cleaners ise Finalizers a göre daha az tehlikeli ama hale tahmin edilemez , yavaş ve genellikle gereksiz.
     *
     * Bu durum ile ilgili fazla örnek yok zaten kitap siz kullanmayın arkada o kullansın yanlış kullanırsanız sistem çok yavaşlar ve
     * sistem açıkları verebilirsiniz diyor.
     */
    public static void main(String[] args) {

    }
}
