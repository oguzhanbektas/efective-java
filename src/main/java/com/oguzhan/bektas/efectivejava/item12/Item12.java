package com.oguzhan.bektas.efectivejava.item12;

public class Item12 {

    /**
     * Always override toString
     * <p>
     * toString i override etmezsek com.oguzhan.bektas.efectivejava.item12.Request@65b54208 bu şekilde çıktı verir.
     */

    public static void main(String[] args) {

        Request request = new Request();
        request.setBody("Govde");
        request.setHeader("Kafa");
    
        System.out.println(request.toString());
    }
}
