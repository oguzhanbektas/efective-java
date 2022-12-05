package com.oguzhan.bektas.java.news.java8;

public interface ForDefaultMethod {

    public void square(int a);

    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
