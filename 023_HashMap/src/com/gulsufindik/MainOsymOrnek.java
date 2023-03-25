package com.gulsufindik;

import java.util.HashMap;

public class MainOsymOrnek {
	
	public static void main(String[] args) {
	
	Ogrenci ogrenci1 = new Ogrenci("Ali", "Kaya", 87,75,83);
	Ogrenci ogrenci2 = new Ogrenci("Fatoş", "Can",55,45,69);
	Ogrenci ogrenci3 = new Ogrenci("ela", "kalı",25,46,49);
	Ogrenci ogrenci4 = new Ogrenci("derya", "özcan",54,15,69);
	
	// key : Integer (TC Kimlik No) -> value: Ogrenci sınfından oluşturulan nesneler
	HashMap<Integer, Ogrenci> hashMap = new HashMap<Integer, Ogrenci>();
	hashMap.put(1145557, ogrenci1);
	hashMap.put(2222222, ogrenci2);
	hashMap.put(1236547, ogrenci3);
	hashMap.put(8546942, ogrenci4);
	
	// Sorgu yazıyoruz.
	
	Ogrenci sonuc= hashMap.get(1145557);
	System.out.println(sonuc);
	
	

	
	}

}
