package com.oguzhan.bektas.efectivejava.item1;

public class Item1 {

    // Consider static factory methods instead of constructors

    /**
     * Neden Constructor yerine static factory method ?
     * <p>
     * 1-Constructorlara istediğimiz gibi isim verme seçeneğimiz olmadığı için. Class ismiyle aynı olmak zorunda
     * 2-Durmadan yeni instance ürettiğimizde cachleme gibi bir mekanizma kurma şansımız yok
     * 3-Constructorlar ile alt tipte veya farklı tipte bir obje üretemiyoruz.
     */
    public static void main(String[] args) {

        // Static factory method static keyword u alması gerekmektedir ve tanımlandığı sınıf türünde
        // bir instance döndürmesi gerekmektedir.
        // Static method sadece static bir değer döndürebilmektedir.

        Food food = Food.coldFood();


        Team t1 = new Team("Cris", 22);
        Team t2 = Team.newFootballPlayer("Ali");

        /**Özet
         *
         * Static factory metod ile isim seçme özelliği kazanıyoruz.
         * Hangi instanceyi döndüreceğimiz ile ilgili tüm kontrolü elimize alıyoruz.
         * Hangi tipte obje döneceksek bunun kontrolünü de ele alıyoruz.
         *
         */
    }

}
