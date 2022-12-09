package com.oguzhan.bektas.efectivejava.item20_21;

import com.oguzhan.bektas.efectivejava.item20_21.abstracts.Bird;
import com.oguzhan.bektas.efectivejava.item20_21.interfaces.SingerAndWriter;

public class Item20 implements SingerAndWriter {

    /*
    Item 20 : Prefer Interface to abstract classes
    İnterfaces ' leri abstract classlara tercih edin
    Interface lerden birine birşey eklediğimiz zaman implemente eden sınıflar hata alır . Oralarda override işlemi
    yapmamızı ister o yüzden geleceğe yönelik tasarım yapmak gerekmektedir.
    Jave 8 den sonra gelen default diye bir özellik var.
    Mesela write interface ine boolean olarak şiir yazabiliyor musun diye default metod ekledik.
    implemente yapma zorunluluğumuz yok artık.

     */

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.takeBreath();
        Item20 item20 = new Item20();
        System.out.println(item20.canWritePoetry());
    }

    @Override
    public void song() {

    }

    @Override
    public void stealSomething() {

    }

    @Override
    public void write() {

    }
}
