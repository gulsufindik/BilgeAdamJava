package com.gulsufindik;

public class CarpmaLimitException extends Exception {

	@Override
	public void printStackTrace() {
		System.out.println("İki sayıda çok büyük daha küçük sayı gir");
	}

	
}