package com.oguzhan.bektas.efectivejava.item5;

import java.util.function.Supplier;

public class YaziAnaliziDependencyInjection {

    private final Sozluk sozluk;

    public YaziAnaliziDependencyInjection(Supplier<Sozluk> sozluk) {
        this.sozluk = sozluk.get();
    }

    public boolean isValid() {
        return true;
    }
}
