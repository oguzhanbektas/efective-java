package com.oguzhan.bektas.efectivejava.item6;

public class RegExample {

    public static boolean isRomanNumerical(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    }
}
