package com.gulsufindik;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("liste.txt")) {
			
			// tüm satırları okuyalım
			int okunan;
			while ((okunan = reader.read()) !=-1 ) {
				char okunanChar = (char) okunan;
				System.out.print(okunanChar);
			}
			
		} catch (FileNotFoundException e) {
			System.out.print("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("Dosya okunurken hata oluştu");
			e.printStackTrace();
		}

	}

}
