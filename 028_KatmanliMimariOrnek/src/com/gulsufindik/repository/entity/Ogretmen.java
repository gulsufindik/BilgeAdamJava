package com.gulsufindik.repository.entity;

public class Ogretmen {
	
	private int tcKimlikNo;
	private String ad;
	private String soyAdi;
	public Ogretmen(int tcKimlikNo, String ad, String soyAdi) {
		super();
		this.tcKimlikNo = tcKimlikNo;
		this.ad = ad;
		this.soyAdi = soyAdi;
	}
	public int getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(int tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyAdi() {
		return soyAdi;
	}
	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}
	@Override
	public String toString() {
		return "Ogretmen [tcKimlikNo=" + tcKimlikNo + ", ad=" + ad + ", soyAdi=" + soyAdi + "]";
	}
	
	
	
	
}
