package com.oguzhan.bektas.efectivejava.item18;

import java.util.HashSet;
import java.util.Set;


public class KompozisyonDüzeltmesi {
	
	private static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
        set.add("Kötü");
        set.forEach(System.out::println);
        
        
    }

}
