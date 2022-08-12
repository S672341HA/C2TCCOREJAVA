package com.framework;

public abstract class Shopfactory {
	
	  public abstract Primeaccount  getNewPrimeaccount(int accNo, string accNm, float charges, boolean
			  isPrime);
	 public abstract Normalaccount  getNewNormalaccount(int accNo, string accNm,float charges,  float deliveryCharges);

}
