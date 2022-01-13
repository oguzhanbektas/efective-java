package com.oguzhan.bektas.efectivejava.item6;

import java.util.regex.Pattern;

public class CozumReg {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isNonNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
