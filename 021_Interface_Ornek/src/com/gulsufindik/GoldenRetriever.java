package com.gulsufindik;

public class GoldenRetriever extends Hayvan {

	@Override
	public void sesCikar() {
		System.out.println("hav hav");
		
	}

	@Override
	public void yemekYe() {
		System.out.println( "Köpek" + this.getAd()+ "Kemik yiyor");
		
		
		
	}

	public GoldenRetriever() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoldenRetriever(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

}
