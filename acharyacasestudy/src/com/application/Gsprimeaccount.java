package com.application;

import com.framework.Primeaccount;

public class Gsprimeaccount extends Primeaccount {
	private static final float charges=50;
	public Gsprimeaccount(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		 
	}

	private static final float charges1=50;
	
public void bookProduct(float charge )  {
	
}

@Override
public String toString() {
	return "Gsprimeaccount [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + "]";
}
}

 
