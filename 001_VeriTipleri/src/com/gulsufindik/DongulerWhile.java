package com.gulsufindik;

import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {

		/*
		 * if gibi bir koşul var en başta, bu koşul sağlanırsa döngü döner..
		 * 
		 * while (koşul) { kodlar... }
		 */

		// for döngüsünden farkı:
		// koşul içindeki kod parçasında koşulun devam edip etmemesi durumunu
		// değiştirebilirsiniz..

//		int sayi = 1;
//				while (sayi < 5) {
//					System.out.println(sayi);
//					sayi++;
//				}
//		
		// Döngünün devam edip etmeme durumu döngü içindeki kod metninde
		// belirlenecekse(değişecekse)
		// "while" veya "do while" kullanın.
		// Yoksa döngü belirli sayıda dönecekse for kullanın.
//		boolean alarmDurumu = false;
//		while(alarmDurumu == false) {
//			// Sensör sıcaklığını kontrol et
//			if (sensorsicaklik >=70) {
//					alarmDurumu = true;
//				}
//				// 1.sn bekle kodu
//			}
//			//  Alarm ver !!

		// Kullanıcı 0'a basana kadar kullanıcının girdiği sayının karesini hesaplayıp
		// ekrana yazdıran bir kod parçası yazınız
		// 0 ise döngüden çıkış olsun...
//				int rakam = 1;
//				Scanner input = new Scanner(System.in);
//				
//				while (rakam !=0) {
//					System.out.println(rakam + " ın karesi: " + rakam * rakam);
//					rakam = input.nextInt();
//				}	
//				System.err.println("ÇIKIŞ");

//				int rakam = 0;
//				Scanner input = new Scanner(System.in);
//				System.out.println("Sayı girmek senden karesini almak benden hadi tuşla...");
//				
//				while ((rakam = input.nextInt()) !=0) {
//					System.out.println(rakam + " ın karesi: " + rakam * rakam);
//					System.out.println("Hadi durma tuşlamaya devam et!");
//				}
//				System.err.println("ÇIKIŞ");
//				
//				
		// DO WHILE DÖNGÜSÜ:
		// do-while döngüsü içindeki kısım en az 1 kere mutlaka çalışır, daha sonra
		// koşula göre çalışır...
		/*
		 * do { //kodlar } while (koşul)
		 */
//				int sayac = 0;
//				do {
//					System.out.println(sayac);
//					sayac++;
//				} while (sayac<5);
//				
		// Aşağıdaki soruyu do-while ile yapınız
		// Kullanıcı 0'a basana kadar kullanıcının girdiği sayının karesini hesaplayıp
		// ekrana yazdıran bir kod parçası yazınız
		// 0 ise döngüden çıkış olsun...

		int x;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Sayı gir tatlım ya da çıkmak için 0'ı tuşla !");
			x = input.nextInt();
			System.out.println(x * x);
		} while (x != 0);
		System.err.println("ÇIKIŞ - DO WHILE");
	}
}
