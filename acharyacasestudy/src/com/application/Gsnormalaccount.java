package com.application;

import com.framework.Normalaccount;

public class Gsnormalaccount extends Normalaccount  {
	protected void bookProduct (float deliveryCharge) {

}

	@Override
	
	public String toString() {
		return "Gsnormalaccount [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm
				+ ", charges=" + charges + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}



 