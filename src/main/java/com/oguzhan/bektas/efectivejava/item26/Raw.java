package com.oguzhan.bektas.efectivejava.item26;

import java.util.ArrayList;
import java.util.List;


// Fails at runtime - unsafeAdd method use a raw type (List) ! Page 119
public class Raw {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(61));
        String s = strings.get(0); // Has compiler - generated cast
        safeAdd(strings,"ssss");
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    private static void safeAdd(List<String> list, Object o) {
        list.add((String) o);
    }
}
