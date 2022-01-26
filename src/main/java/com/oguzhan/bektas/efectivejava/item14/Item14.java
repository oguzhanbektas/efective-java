package com.oguzhan.bektas.efectivejava.item14;

import java.util.ArrayList;
import java.util.Collections;

public class Item14 {

	/** Consider implementing comparable - Comparable interface i
	 * Belirli sınıftaki verileri sıralayabilimek için kullanılır. Mesela kitap class i için sayfa sayısına göre yapabiliriz.
	 * Collections.sort(kitapListesi); kullanabilmek için sınıfınızın Comparable ı implement etmesi gerekmektedir.
	 *	Comparator ile de sıralanabiliyor.
	 *
	 * Düz ve değişmeyecek sıralama var ise  Comparable, karışık ve değişmesi muhtemel ise Comparator kullanılabilir.
	 */
	
	public static void main(String[] args) {

		ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();
		
		kitapListesi.add(new Kitap("Şibumi", 500));
		kitapListesi.add(new Kitap("Otomatik Portakal", 200));
		kitapListesi.add(new Kitap("Ab", 200));
		
		Collections.sort(kitapListesi);
		
		System.out.println("Sıralama1");
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
		// Sıralama 2
		System.out.println("Sıralama2");
		IsımKıyaslama ismeGöre = new IsımKıyaslama();
		Collections.sort(kitapListesi, ismeGöre);
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
			
	}

}
