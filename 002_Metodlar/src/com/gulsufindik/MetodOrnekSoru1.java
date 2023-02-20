package com.gulsufindik;

import java.util.Scanner;

public class MetodOrnekSoru1 {
	
	
	private static void randomNumber7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen üsrt limiti giriniz: ");
		int ustLimit = scanner.nextInt();
		
	Random random = new Random();
	for (int i=0; i<10; i++) {
		int result = 1;
		do {
			result = random.nextInt(ustLimit);
		} while ((result %7) !=0);
		System.out.println("Sayı " + i + " :"+ result);
	}
		
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// Rastgele 7'in katı olan 10 tane tamsayı üreeten ve ekrana yazdıran bir metod yazın. üst limiti parametre olarak kullanıcıdan alın.
		
		randomNumber7():

	}

}
