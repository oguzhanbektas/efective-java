package com.oguzhan.bektas.java.news.java8;

import java.util.ArrayList;

public class LambdaExpressions {

    /*
    Lambda expressionlar, herhangi bir class’a ait olmadan iş yapabilen fonksiyonlardır.
    Lambda ile birlikte Java, funtional programming dünyasına da girmiş bulunmaktadır.
    Bu oldukça önemli bir gelişme, Java’nın ilerde gideceği yol hakkında da ipucu veriyor bizlere.
    Lambda sayesinde hem daha okunabilir kod üretiyor, hem de kod tekrarından kurtuluyoruz. Bir lambda ifadesini
    tekrar tekrar kullanabilir, parametre olarak başka bir yere iletebiliriz. Lambda syntax’ına bakalım;

    (argument-list) -> {body}

    argument-list : empty yada birden fazla olabilir duruma göre.
    -> : arrow token, parametreler ile body statement’ı linkler.
    {body} : expression yani asıl kodu içeren kısımdır.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    interface StringFunction {
        String run(String str);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
