package com.framework;

public abstract class Normalaccount extends Shopaccount {
	 private final float deliveryCharge;
	
	public Normalaccount(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {
	
	}

	@Override
	public String toString() {
		return "Normalaccount [deliveryCharge=" + deliveryCharge + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}