package com.gulsufindik;

public class MetodOrnekleri2 {
	
	// bir tamsayı dizisi içindeki sayılar toplatıp toplamı return eden bir metod yazalım
	private static int diziTopla(int[] dizi) {
		int toplam = 0;
		
		for (int i=0; i<dizi.length; i++) {
			//toplam = toplam + dizi[i];
			toplam += dizi[i]; // -> Yukardaki ile aynı
		}
		return toplam;
	}

	public static void main(String[] args) {
		
		int[] array = {5, 10, 15, 20, 25};
		System.out.println(diziTopla)

	}

}
