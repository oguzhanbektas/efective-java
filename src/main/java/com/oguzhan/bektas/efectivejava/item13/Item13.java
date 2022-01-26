package com.oguzhan.bektas.efectivejava.item13;


import com.oguzhan.bektas.efectivejava.item7.Stack;

public class Item13 {

    /**
     * Clone
     * Çok önerilen bir şey değildir.Genelde kullanmayın diyor çoğu kaynak.
     * Shallow Copy
     */

    public static void main(String[] args) {

        //Shallow Copy
        Stack stack = new Stack();
        Stack stack1 = stack; // Referans eşitliği sağladık.

        System.out.println(stack == stack1);// Kanıtı
        //Bu yöntem Shallow Copy oluyor.


        //Deep Copy

        Stack stc = new Stack();
        stc.stackName = "ozi";
        Stack stc2 = new Stack();
        stc2.stackName = stc.stackName;

        System.out.println(stc == stc2);

    }
}
