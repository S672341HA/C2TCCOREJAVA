package com.framework;

public abstract class Primeaccount extends Shopaccount {
	private boolean isPrime;
	private static final float deliveryCharge=50.0f;
	public Primeaccount(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public void bookProduct(float charges) {
		
	}

	@Override
	public String toString() {
		return "Primeaccount [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}