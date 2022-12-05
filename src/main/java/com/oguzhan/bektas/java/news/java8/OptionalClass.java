package com.oguzhan.bektas.java.news.java8;

import java.util.Optional;

public class OptionalClass {
    /*
    Optional yapısı, sizinde tahmin edebildiğiniz gibi null check işlemleri için geliştirilmiş bir özelliktir.
    Bu özellik sayesinde NullPointerException hatasıyla karşılaşmanız imkansız olacaktır diyebiliriz.
    Optional sınıfı ile objenizi eğer null değilse kullan veya null ise başka bir şey vs. diyebiliyorsunuz.
     */

    public static void main(String[] args) {
        // user objesi null ise exception fırlatılır
//        Optional.of(user);
        // user objesi null olabilir de olmayabilir de. Herhangi bir exception atmayacaktır
//        Optional.ofNullable(user);
        // user objesi null değil ise isPresent methodu boolean true dönecektir
//        Optional.ofNullable(user).isPresent();
        // user objesi null ise default bir user return etmesini sağladık
//        Optional.ofNullable(user).orElseGet(User.EMPTY_USER);
        // user objesi null ise exception fırlatmasını istedik
//        Optional.ofNullable(user).orElseThrow(throw new UserValidationException("User coult not be null!"));

    }
}
