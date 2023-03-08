package com.gulsufindik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {

	public static void main(String[] args) {

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrencilerListe.bin"))) {

			ArrayList<Ogrenci> list = (ArrayList<Ogrenci>) inputStream.readObject();

			for (Ogrenci ogr : list) {
				System.out.println(ogr);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya yazılmadı");
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			System.out.println("Serialization hatası");
			e.printStackTrace();
		}
		System.out.println("ArrayList ve öğrenci nesneleri dosyadan okudundu");

	}

}
