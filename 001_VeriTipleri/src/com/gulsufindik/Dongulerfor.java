package com.gulsufindik;

import java.util.Scanner;

public class Dongulerfor {

	public static void main(String[] args) {

//		System.out.println("Merhaba 0");
//		System.out.println("Merhaba 1");
//		System.out.println("Merhaba 2");
//		System.out.println("Merhaba 3");
//		
		// Bir şeyi n kere yazdıracaksam kaç kere saydığımı kontol edebilmek için bir
		// değişkene ihtiyacım var.
		// 0 değişken de genelde for döngülerinde i veya j isminde tutulur/kullanılır.
		// Size kalmış...

//		for (int i=0 ; i<4; i++) {
//			System.out.println("Merhaba " + i);
//		}
//		
//		for (int sayac=0; sayac < 3 ; sayac ++) {
//			System.out.println("Java");
//		}
//		

		// int i; // ambiguity -> Döngülerde kullandığınız sayaç değişken isimlerini kod
		// içinde kullanmamaya çalışın.
		System.out.println("\n*******\n");

		// soru
		for (int i = 0; i < 3; i++) {
			System.out.println("Merhaba");
			System.out.println("Dünya");
		}

//		int x = 0;
//		if (x > 1) {
//		System.out.println("1'den büyük");
//		System.out.println("0'dan da büyük");
//		}

		// sonsuz döngü
//		for(;;) {
//			System.out.println("Love u");
//		}

		// for (int i=0; i<5; i++)
		// Aşağıdaki kod çalışır ama tavsiye edilmez
//		int i = 0;
//		for(;i<5;) {
//			System.out.println("Hello " + i);
//			i++;
//		}

		// örnek:
		// 1'den 10'a kadar olan sayıların toplamını for ile bulalım:
		int toplam = 0; // toplam değişkenini tanımladım ve 0'ı ilk değer olarak atadım ( initialize
						// ettim)
		int z = 0;
		for (int i = 1; i <= 10; i++) {
			toplam = toplam + i;
		}
		System.out.println("Toplam: " + toplam);
		System.out.println(z);

		// Soru :
		// 1'den 10'a kadar olan tüm tek sayıları ekrana yazdırın
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}

		// Soru:
		// Ekrana aşağıdaki şekli çizdiren döngü yazınız
		// * * * *
		// * * * *
		// * * * *
		for (int i = 1; i <= 12; i++) {
			System.out.println("* ");
			if (i % 4 == 0)
				System.out.println();
		}

		// Soru:
		// aşağıdaki kodu çalıştırınca kaçkere test yazar?
		// Bu şekilde for döngüsü içinde index'i değiştirmek tavsiye edilmez.
		// Eğer kod bloğu içinde index'i (sayacı) değiştirmek gereken durumlar oluyorsa
		// "while" veya "do while" döngülerini kullanınız.
		for (int i = 0; i < 11; i++) {
			i = 10;
			System.out.println("test");
		}

		// Soru :
		// Kullanıcıdan iki tane sayı alın
		// Başlangıç ve bitiş sayıları arasında 7'ye bölünebilen sayıları ekrana
		// yazdırın

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen 1.sayıyı giriniz: ");

		int x = input.nextInt();
		System.out.println("Lütfen 2.sayıyı giriniz: ");
		int y = input.nextInt();

		for (int i = x; i < y; i++) {
			if (i % 7 == 0)
				System.out.println(i);
		}
	}
}
