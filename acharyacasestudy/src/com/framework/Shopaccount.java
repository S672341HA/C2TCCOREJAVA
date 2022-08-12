package com.framework;

public abstract class Shopaccount {
	 private int accNo;
	 private String accNm;
	 private float charges;
	
	
	
	
	public Shopaccount(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	 public void bookProduct(float charges) {

}
	
	public void items(float charges) {
		
	}

	@Override
	public String toString() {
		return "Shopaccount [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
