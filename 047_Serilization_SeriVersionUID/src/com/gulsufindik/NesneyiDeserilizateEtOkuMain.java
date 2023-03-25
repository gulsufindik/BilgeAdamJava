package com.gulsufindik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneyiDeserilizateEtOkuMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("otomobil.bin"))) {
			
			// Yazdığımız sırayla okumalıyız
			Otomobil oto1 = (Otomobil) inputStream.readObject();
			Otomobil oto2 = (Otomobil) inputStream.readObject();
			Otomobil oto3 = (Otomobil) inputStream.readObject();
			
			System.out.println(oto1);
			System.out.println(oto2);
			System.out.println(oto3);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya okuma hatası");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("bilinemeyen bir hata oluştu");
			e.printStackTrace();
		}
		
		System.out.println("Deserialization process completed");
	

	}

}
