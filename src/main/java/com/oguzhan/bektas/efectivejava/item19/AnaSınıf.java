package com.oguzhan.bektas.efectivejava.item19;

abstract class AnaSınıf {
	
	public AnaSınıf() {
		System.out.println("Çalışıyorum");
		overrideMe();
	}

	abstract void overrideMe(); 
	

}
