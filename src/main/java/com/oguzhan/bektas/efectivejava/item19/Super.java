package com.oguzhan.bektas.efectivejava.item19;

//Class whose constructor invokes an overridable method. NEVER DO THIS! (Page 95)
public class Super {
	// Broken - constructor invokes an overridable method
	public Super() {
		overrideMe();
	}

	
	public void overrideMe() {
	
	}

}