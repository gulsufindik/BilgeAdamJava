package com.gulsufindik;

public class AnkaraKedisi extends Hayvan {

	@Override
	public void sesCikar() {
		System.out.println("Miyaav");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek "+this.getAd()+ " kemik yiyor..");
		
	}

	public AnkaraKedisi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnkaraKedisi(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

}
