package com.oguzhan.bektas.java.news.java8;

public class FunctionInterfaces {

    static Foo addition = (x, y) -> x + y;
    static Foo multiplication = (x, y) -> x * y;

    public static void main(String[] args) {

        System.out.println("3 + 5 = " + addition.apply(3, 5));
        System.out.println("3 * 5 = " + multiplication.apply(3, 5));
    }

    @FunctionalInterface // Opsiyonel
    public interface Foo {

        int apply(int x, int y);

    }
}


