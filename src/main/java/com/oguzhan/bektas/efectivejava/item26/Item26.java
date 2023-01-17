package com.oguzhan.bektas.efectivejava.item26;

import java.util.ArrayList;
import java.util.List;

public class Item26 {

    /*
    Java Raw Types - Raw Type Kullanmayın.
    Parameterized type --> List<String> +
    Raw Tyoe -> List -
    Actual type parameter -> String
    Generic Type List<E>
    Formal type parameter List
    Unbounded wildcard type List <?>
    Bounded type parameter <E extends Number>
    Recursive type bound <T extends Comparable<T>>
    Bounded wildcard type List<? extends Number>
    Generic methpd static <E> List<E> asList(E[] a)
     */

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Ali");
        nameList.add("Veli");
//        nameList.add(Boolean.TRUE);

//        String anyElement= (String) nameList.get(2);

    }
}
