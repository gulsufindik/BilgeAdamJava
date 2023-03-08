package com.gulsufindik;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOgrenci {

	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
		
		// Scanner sınıfı Closeable interfacesini implement ettiği için try-with-resourcez kalıbı ile kullanılabilir
		// (+ Scanner bir InputStream ile çalıştığı için tabi ki)
		try(Scanner scanner = new Scanner(new FileReader("liste.txt"))) {
			
			// tüm satırları nasıl okuruz?
			while(scanner.hasNextLine()) 
			{
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(","); // Ali kaya, 111 -> array[0] = "Ali kaya" ve array[1] = "111"
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));  // array[1].trim() -> "111"
				ogrenciList.add(ogrenci);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}

	}

}
