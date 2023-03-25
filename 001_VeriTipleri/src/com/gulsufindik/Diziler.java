package com.gulsufindik;

import java.util.Scanner;

// Diziler(Arrays)
public class Diziler {

	public static void main(String[] args) {

		// tam sayı dizisi: => {1, 7, 12, 39, 55, 88, 91}
		// metin dizisi: => {"ali", "veli", "ayşe", "ahmet"}

		// dizi tanımlama:
		// dizinin cinsi önce yazılır byte, short, int, long, ..v.s. sonra []
		long[] dizi1;

		// Kural: Dizileri initialize etmeden onları kullanamazsın
		dizi1 = new long[7]; // Siz bu satırı yazdığınızda Java arka planda şöyle bir şey oluşturur:
		dizi1 = new long[7]; // {0, 0, 0 ,0 , 0, 0, 0}

		System.out.println(dizi1[0]); // UNUTMAYALIM: dizilerin ilk elemanının indeksi 0'dır !
		System.out.println(dizi1[dizi1.length - 1]);
		System.out.println(dizi1.length);

		// Dikkat:
		// Dizinin boyunlarını aşan indekslere erişmeye çalışırsanız hata alırsınız,
		// mesela:
		// System.out.println(dizi[7]); -> hata verir çünkü 7 son indeksten büyük !

		// Dizilerde atama yapmak:
		dizi1[0] = 10;
		dizi1[1] = 15;
		dizi1[6] = 28; // {10, 15, 0 , 0 , 0 ,0, 28}
		System.out.println(dizi1[1]);

		// Dizilerin değerleri okunurken genelde for loop kullanılır:
		for (int i = 0; i < 7; i++) {
			System.out.println(dizi1[i]);
		}

		// Yukarıdaki yöntem yerine son değer olarak dizinin length'ini kullanın:
		for (int i = 0; i < dizi1.length; i++) {
			System.out.println(dizi1[i]);
		}

		System.out.println();

		// Dizi tanımlama 2.Yöntem:
		int[] myArray = { 1, 5, 9, 24, 112 };
		System.out.println(myArray[2]);

		System.out.println();

		// Dizi tanımlama 3.Yöntem:
		int[] arrayInt = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		// Soru: (önemli)
		int[] array1 = { 1, 5, 9, 24, 112 };
		int[] array2 = { 10, 50, 90, 240, 1120 };
		array1 = array2;
		array1[0] = 999;
		System.out.println(array2[0]);
		// Ekrana ne yazar?
		// cevap 999 (array1 ve array2 birbirine eşitlendiği için heap ten array1
		// silinir)

		// Dizi Tanımlama String
		String[] arrayString = new String[] { "Ali", "Veli", "Zeynep", "Can" };
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println(arrayString[i]);
		}

		// Böyle de tanımlayabiliriz:
		String[] dizi2 = new String[3];
		dizi2[0] = "Papatya";
		dizi2[1] = "Gül";
		dizi2[2] = "Lale";
		// dizi2[3] ="Orkide"; -> hatalı olur
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		System.out.println("\n---\n");

		// null konusu:
		String isim;
		// System.out.println(isim); // isim değişkenine atama yapmazsam(initialize
		// etmezsem) IDE kırmızıya boyayıp hata veriyor!

		// Örnek:
		String[] dizi3 = new String[3]; // -> {null, null, null}
		dizi3[0] = "Ali";
		for (int i = 0; i < dizi3.length; i++) {
			System.out.println(dizi3[i]);
		}

		// Örnek: (Runtime sırasında dizi oluşturma)
		// Kullanıcıdan bir tam sayı alalım, girilen tamsayı dizinin boyutu olsun.
		// Bu dizinin içeriğini de yine kullanıcı console'dan girerek oluştursun

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dizinin boyutunu giriniz: ");
		int diziBoyutu = scanner.nextInt();
		int[] diziOrnek = new int[diziBoyutu];
		for (int i = 0; i < diziBoyutu; i++) {
			diziOrnek[i] = scanner.nextInt();
		}

		// yukarıdaki kullanıcının oluşturduğu diziyi ekrana yazdırın
		for (int i = 0; i < diziOrnek.length; i++) {
			System.out.println(diziOrnek[i]);
		}

	}

}
