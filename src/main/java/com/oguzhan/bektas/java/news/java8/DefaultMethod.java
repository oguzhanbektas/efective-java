package com.oguzhan.bektas.java.news.java8;

public class DefaultMethod implements ForDefaultMethod {


    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.square(2);
        defaultMethod.show();
    }
}
