package com.gulsufindik;

import java.util.Scanner;

public class DiziOrnekler2 {

	public static void main(String[] args) {

		// soru: (önemli)
		// kullanıcı bir sayı girsin.Bu sayının binary olup olmadığını bulan bir program
		// yazınız.

		// Örnek: 10101 -> binary
		// 123 -> binary değil
		System.out.println("Lütfen bir sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String temp = String.valueOf(num);
		boolean sayiBinarMi = true;
		for (int i = 0; i < temp.length(); i++) {
			char rakam = temp.charAt(i);

			if (rakam == '1' || rakam == '0') {
				// hiçbir şey yapma
			}

			else {
				sayiBinarMi = false;
				break;
			}

		}
		if (sayiBinarMi == true)
			System.out.println("Girdiğinşz ayı binary!");
		else
			System.out.println("Girdiğiniz sayı binary değil!");

	}
}
