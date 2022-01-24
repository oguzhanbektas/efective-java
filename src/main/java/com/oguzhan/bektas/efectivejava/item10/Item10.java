package com.oguzhan.bektas.efectivejava.item10;

public class Item10 {

    /**
     * Obey the general contract when overriding equals
     * <p>
     * Equals metodu nu override ettiğimizde aşağıdaki özellikleri kaşılamalı
     * <p>
     * Reflexive : an object must equals itself x.equals(x)
     * Bir objeyi kendisiyle kıyasladığımızda eşit olması default equals bunu karşılıyor
     * Symmetric: x.equals(y) must return the same result as y.equals(x)
     * d1 d2 ye eşitse d2 de d1 eşit olmasını bekliyor
     * Transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
     * x y ye eşitse y de z ye eşitse o zaman x de z ye eşit olmalı
     * Consistent: the value of equals() should change only if a property that is contained
     * in equals() change(no randomness allowed)
     * Tutarlı. Equals ın false dönmesi için belirli bir değişiklik olması lazım propertylerde değişiklik olmadığı sürece
     * dönüş türünde değişiklik olmaz
     * null control x.equals(null)
     * false olmalı
     */

    public static void main(String[] args) {

        //Part 1
        //Integer Type
        System.out.println(10 == 20);
        //Char Type
        System.out.println('a' == 97.0);
        //Boolean Type
        System.out.println(true == true);

        System.out.println((int) 'a'); //cast char to int
        System.out.println('a' == 97); //char is automatically promoted to int
        System.out.println('a' + 1); //char is automatically promoted to int
        System.out.println((char) 98); // cast int to char

        DenemeSinif denemeSinif = new DenemeSinif(1, 2);
        DenemeSinif denemeSinif2 = new DenemeSinif(1, 2);
        // İkisi de false dönüşü false override edilmesi gerekiyor
        System.out.println(denemeSinif2 == denemeSinif);
        System.out.println(denemeSinif2.equals(denemeSinif));

        // Equals i override edince doğru sonucu verdi
        DenemeSinifOverride d = new DenemeSinifOverride(1, 2);
        DenemeSinifOverride d2 = new DenemeSinifOverride(1, 2);
        System.out.println(d == d2);
        System.out.println(d.equals(d2));
    }
}
