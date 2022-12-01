package com.oguzhan.bektas.efectivejava.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GuvenliKod {

    protected void mesaj() {
        System.out.println("Hello");
        privateMesaj();
    }

    private void privateMesaj() {
        System.out.println("private message");
    }

    // Guvenlik Açığı
    private static final String[] NEWS_SITES = new String[]{
            "x",
            "y",
            "z"
    };
    //    1.Yontem
    public static final List<String> VALUES = Collections.unmodifiableList(Arrays.asList(NEWS_SITES));

    //    2.Yontem
    public static final String[] values() {
        return NEWS_SITES.clone();
    }

    public static void haberleriAl(String url) {
        for (String newUrl : VALUES) {
            if (url.equalsIgnoreCase(newUrl)) {
                // Do Something
            }
        }
    }
}
