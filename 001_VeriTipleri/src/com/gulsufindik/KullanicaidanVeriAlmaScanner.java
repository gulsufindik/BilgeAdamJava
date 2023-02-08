package com.gulsufindik;

import java.util.Scanner;

public class KullanicaidanVeriAlmaScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi1 = 0;
		sayi1 = input.nextInt();
		System.out.println("Girdiğiniz sayı: " + sayi1);
		
		int sayi2 = sayi1 * sayi1;
		System.out.println("Girdiğiniz sayının karesi: " + sayi2);
		
		int sayi3 = sayi1*sayi1*sayi1;
		System.out.println("Girdiğiniz sayının küpü: "+ sayi3);
	}
}
