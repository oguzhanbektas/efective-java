package com.oguzhan.bektas.efectivejava.item20_21.interfaces;

public interface Writer {

    public void write();

    default boolean canWritePoetry() {
        return true;
    }

}
