package com.gulsufindik;

import java.util.Scanner;

public class KullanıcıdanVeriAlmaScanner2 {

	public static void main(String[] args) {

		// Kullanıcıdan metinsel girdi almak:
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen adınızı yazın:");
		String isim;
		isim = input.nextLine();
		System.out.println("İsminiz: " + isim);

		System.out.println("Lütfen soyadınızı yazın:");
		String soyIsim;
		soyIsim = input.nextLine();

		System.out.println("Yaşınızı girin:");
		int yas = input.nextInt();

		// DİKKAT!
		// nextInt()'den sonra eğer kulanıcıdan String alacaksanız araya bir boş
		// nextLine() satırı yazın
		input.nextLine();

		System.out.println("Lütfen yaşadığınız şehri yazınız:");
		String sehir = input.nextLine();
		System.out.println(
				"İsminiz: " + isim + " Soyadınız: " + soyIsim + " Yaşınız: " + yas + " Yaşadığınız il:" + sehir);

		// String'den int'e çevirmek için ilgili veri tipinin wrapper class'ı
		// kullanılır.
		String yas2 = "30";
		int yasIntValue = Integer.valueOf(yas2);
		System.out.println(yasIntValue);

	}

}
