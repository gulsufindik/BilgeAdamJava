package com.gulsufindik;

public class SerceSinifi extends Hayvan implements IUcabilir{

	@Override
	public void sesCikar() {
		System.out.println("cik cik");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Serce"+ this.getAd()+ " yem yiyor");
		
		
		
	}

	public SerceSinifi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SerceSinifi(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + " adlı serçe kanatlarını saniyede 10 kez çırpıyor");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı serçe knatlarını temizliyor");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + " adlı serçe küük gagasıyla"+ nesne+ "gagalıyor");
	}

	

}
