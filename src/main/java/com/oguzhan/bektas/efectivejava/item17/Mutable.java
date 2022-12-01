package com.oguzhan.bektas.efectivejava.item17;

public class Mutable extends Immutable {
    private int realValue;

    public Mutable(int value) {
        super(value);
        realValue = value;
    }

    public int getValue() {
        return realValue;
    }

    public void setValue(int realValue) {
        this.realValue = realValue;
    }

    public static void main(String[] args) {
        Mutable obj = new Mutable(4);
        Immutable immutable =(Immutable) obj;
        System.out.println(immutable.getValue());
        obj.setValue(8);
        System.out.println(immutable.getValue());
        // immutable sınıf yaptık ama yavru sınıf bozdu kuralı o yüzden immutable sınıfa final eklenmesi lazım
    }
}
