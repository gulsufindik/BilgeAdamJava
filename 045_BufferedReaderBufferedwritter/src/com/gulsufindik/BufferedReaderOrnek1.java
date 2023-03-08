package com.gulsufindik;

import java.io.BufferedReader;

//büyük metin yazılarını okuyup yazmaya yarar
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOrnek1 {

	private static void dosyadanBirSatirOku() {
		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {
			
			String s = reader.readLine();
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı");
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyadan okuma hatası");
			e.printStackTrace();
		}
	}
	
	private static void dosyaninTamaminioku() {
		try (BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))) {
			
			String s = null;
			while ((s = reader.readLine()) !=null)
			{
				System.out.println(s);
			}
		
			System.out.println(s);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		dosyadanBirSatirOku();

	}

}
