package com.oguzhan.bektas.efectivejava.item10;

import java.util.Objects;

public class DenemeSinifOverride {

    private int d1, d2;

    public DenemeSinifOverride(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DenemeSinifOverride)) return false;
        DenemeSinifOverride that = (DenemeSinifOverride) o;
        return d1 == that.d1 && d2 == that.d2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(d1, d2);
    }
}
