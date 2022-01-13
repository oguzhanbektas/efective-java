package com.oguzhan.bektas.efectivejava.item1;

public class Food {

    String name;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Food coldFood(){
        return new AyranCorbasi();
    }

    public static Food warmFood(){
        return new Pide();
    }
}
