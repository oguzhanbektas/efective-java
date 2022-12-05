package com.oguzhan.bektas.efectivejava.item19;

public class CocukSınıf extends AnaSınıf{
	
	final int deger;
	
	public CocukSınıf(int deger) {
		System.out.println("Çocuk sınıfta değer atanıyor.");
		this.deger = deger;
	}

	@Override
	void overrideMe() {
		// TODO Auto-generated method stub
		System.out.println(deger);
	}
	
	
	public static void main(String[] args) {

		CocukSınıf cocuk = new CocukSınıf(42);

		
		
		
	}
	
	
	

}
