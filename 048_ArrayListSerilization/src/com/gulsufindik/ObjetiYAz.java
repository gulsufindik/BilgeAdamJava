package com.gulsufindik;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjetiYAz {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ayşe", 1234, "Bilg Müh");
		Ogrenci ogrenci2 = new Ogrenci("Ali", 1234, "Elektrik Müh");
		Ogrenci ogrenci3 = new Ogrenci("Fatma", 1234, "Maden Müh");
		Ogrenci ogrenci4 = new Ogrenci("Kazım", 1234, "Metal Müh");
		Ogrenci ogrenci5 = new Ogrenci("Lale", 1234, "Bilg Müh");
		
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
		ogrenciList.add(ogrenci1);
		ogrenciList.add(ogrenci2);
		ogrenciList.add(ogrenci3);
		ogrenciList.add(ogrenci4);
		ogrenciList.add(ogrenci5);
		
		try (ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("ogrencilerListe.bin")) {
			
			out.writeObject(ogrenciList);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya yazılmadı");
			e.printStackTrace();
		
		} catch (Exception e) {
			System.out.println("bilinemeyen bir hata oluştu");
			e.printStackTrace();
		}
		System.out.println("ArrayList ve öğrenci nesneleri dosyaya yazıldı");

	}

}
