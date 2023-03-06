package com.gulsufindik.repository.entity;

public class Ogrenci {
	
	private String ad;
	private String soyAdi;
	private String id;
	public Ogrenci(String ad, String soyAdi, String id) {
		super();
		this.ad = ad;
		this.soyAdi = soyAdi;
		this.id = id;
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
	public void setSoyadi(String soyAdi) {
		this.soyAdi = soyAdi;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyAdi=" + soyAdi + ", id=" + id + "]";
	}

	
	
}
