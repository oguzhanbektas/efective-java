package com.oguzhan.bektas.item7;

public class GarbageCollector {
    public void finalize() {
        System.out.println("Çöpler atıldı.");
    }

    public static void main(String[] args) {
        Item7 x = new Item7();
        Item7 y = new Item7();
        Item7 z = new Item7();

        x = null;
        z = y;
        //Garbage Collector u tetiklemek için
        // Tetiklendiğini anlamamız için finalize nin olması lazım.
        System.gc();

    }
}
