package com.gulsufindik;

public class DizilerMultiDimensional {

	public static void main(String[] args) {

		int[] tekBoyutluDizi = new int[4]; // {0,0,0,0} tek boyutlu dizi
		int[] tekBoyutluDizi2 = { 3, 7, 12, 95, 23 };

		// çok boyutlu dizi (matris de denir matematikte)
		int[][] cokBoyutluDizi = new int[2][3]; // 2 satır ve 3 sütunlu bir matris/dizi oluşturduk
												// {{0,0,0},{0,0,0}}

		// 2.yöntem 2 satır 3 sütunlu dizi
		int[][] cokBoyutluDizi2 = { { 1, 2, 3, }, { 4, 5, 6 } };
		// Ör 2. 4 satır 3 sütunlu bir dizi
		int[][] cokBoyutluDizi3 = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 10, 11, 12 } };

		// 0 0 0
		// 0 0 0
		cokBoyutluDizi[0][0] = 1;
		// 1 0 0
		// 0 0 0

		cokBoyutluDizi[1][2] = 8;
		// 1 0 0
		// 0 0 8

		System.out.println(cokBoyutluDizi[0][0]);
		System.out.println(cokBoyutluDizi[1][2]);
		System.out.println(cokBoyutluDizi[0][1]);

		// örnek
		// bir sınıf listesi yapalım, içeriği şu sekilde olsun
		// sıraNo: öğrenci No: ad: soyad:
		// 1 101 Ali Kaya
		// 2 102 Veli Öz
		// 3 103 Zeynep Çalışkan

		String[][] sinifListesi = new String[3][4]; // 3 satır 4 sütunlu matris(2boyutlu String dizisi) oluşturma

		// şimdi içine kayıt atalım;
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ali";
		sinifListesi[0][3] = "Kaya";

		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Veli";
		sinifListesi[1][3] = "Öz";

		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Zeynep";
		sinifListesi[2][3] = "Çalışkan";

		// Yukarıdaki öğrenci bilgilerini ekrana yazdıralım:
		System.out.println("Manuel Öğrenci Listesi");
		System.out.println("----------------");
		System.out.println(
				sinifListesi[0][0] + " " + sinifListesi[0][1] + " " + sinifListesi[0][2] + " " + sinifListesi[0][3]);
		System.out.println(
				sinifListesi[1][0] + " " + sinifListesi[1][1] + " " + sinifListesi[1][2] + " " + sinifListesi[1][3]);
		System.out.println(
				sinifListesi[2][0] + " " + sinifListesi[2][1] + " " + sinifListesi[2][2] + " " + sinifListesi[2][3]);
		// satır satır yazmak yerine iç içe döngüyle yapılmalıdır

		// çözüm iç içe for döngüsü satır satır yazdıracağız
		// tüm satırların içinde dönen bir döngü

		System.out.println("\n\nÖğrenci Listesi iç içe for loop döngü");
		for (int satir = 0; satir < 3; satir++) { // satır satır yazdırdığım için ilk döngüm satır sayısı kadar dönecek
			for (int sutun = 0; sutun < 4; sutun++) { // ikinci döngüm sütun sayısı kadar olmalı, çünkü her bir satırda
														// o satır için sütunları tek tek yazdırıyoruz
				System.out.println(sinifListesi[satir][sutun] + " ");
			}
			System.out.println();
		}

		// Code Refining:
		// Burada 3(satır) ve 4(sütun) sayılarını kod içine direk yukarıdaki gibi gömmek
		// doğru değil
		// bunun yerine dizilerin length özelliğini kullanalım
		System.out.println("\n\nÖğrenci Listesi iç içe for loop - code refining");
		for (int satir = 0; satir < sinifListesi.length; satir++) { // sinifListesi.length satır sayısını verir
			for (int sutun = 0; sutun < sinifListesi[satir].length; sutun++) { // sinifListesi[satir].length ise satir
																				// index numaralı satırdaki sutun
																				// sayısını verir.
				System.out.println(sinifListesi[satir][sutun] + " ");
			}
			System.out.println();
		}

		// 3.boyutlu dizi:
		int[][][] dizi3Boyut = new int[3][3][3];
		dizi3Boyut[0][0][0] = 23;
		System.out.println(dizi3Boyut[0][0][0]);

		// EK BİLGİ:
		// Herhangi bir String ifade içindeki sayıyı primitive veri tipine çevirmek için
		// wrapper class'ları kullanırız
		int siraNo = Integer.parseInt(sinifListesi[0][0]);
		System.out.println(siraNo);

		String sayiStr = "12.345";
		double sayi2 = Double.parseDouble(sayiStr);
		System.out.println(sayi2);

		String sy = "12.33229";
		float xx = Float.parseFloat(sy);
		System.out.println(xx);

		// Diğerlerini inceleyip test edin internetten arastırın
		// wrapper sınıflar
		// byte Byte
		// short Short
		// int Integer
		// long Long
		// float Float
		// double Double
		// boolean Boolean
		// char Char

	}

}
