package com.gulsufindik;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {
		
//		String metin = "Naber?";
//		Scanner input = new Scanner(System.in);
//		metin = input.nextLine();
//		System.out.println(metin);

		
		//   0   1   2	 3	 4	 5   6   7   8   9   10  11 ... 	
		// {'B','u','g','u','n',' ','J','a','v','a',' ','i',......'z'} --> char dizisi
		String metin = "Bugün Java ile string konusunu işleyeceğiz";		
		String tekharf = "a"; // char[] dizi -> {'a'} -> Java bunu 1 elemanlı char dizisi olarak tutar..
		
		// String en çok kullanılan metodları/fonksiyonları:
		
		// length metdou:
		// metin.length() -> metnin uzunluğunu int cinsinden verir.
//		int uzunluk = metin.length();
//		System.out.println(uzunluk);
		
		
		// charAt metodu:
		// Belirli bir indexteki karakteri döner...
//		System.out.println("0. index karakter: " + metin.charAt(0));
//		System.out.println("2. index karakter: " + metin.charAt(2));
//		
		// Peki bu metnin uzunluğu kaçtı? 42
		// Peki en sonuncu karaktere nasıl erişeceğiz?
		// System.out.println("42. karakter: " + metin.charAt(42)); -> hata alırısnız
//		System.out.println("Son karakter: " + metin.charAt(41)); // -> Doğru
//		System.out.println("Son karakter: " + metin.charAt(metin.length() -1));
		
		
		// indexOf metodu:
		// Find the index
		
		// s harfi ilk nerede geçiyor? hangi indexte?
//		System.out.println("s harfi ilk nerede geçiyor? : " + metin.indexOf("s"));
//		System.out.println("s harfi ilk nerede geçiyor? : " + metin.indexOf("B"));
//		System.out.println("s harfi ilk nerede geçiyor? : " + metin.indexOf("b")); // aradığınız karakter bulunamazsa -1 döner
		
		// birden fazla harf arama
		//        java kelimesi ilk nerede geçiyor?
//		System.out.println("Java kelimesi ilk nerede geçiyor?: " + metin.indexOf("Java"));
		
		
		// soru:
		// metin string i içinde x harfinin kullanılıp kullanılmadığını bulunuz...
//		if (metin.indexOf('x') == -1) {
//			System.out.println("x harfi metnin içinde yoktur");
//		}
//		else {
//			System.out.println("x harfi metnin içinde vardır");
//		}
		
		// i harfi ilk nerede geçiyor?
//		System.out.println("i harfi ilk nerede geçiyor? : " + metin.indexOf("i"));
//		
//		System.out.println("i 14.indexten sonra ilk nerede geçiyor? " +metin.indexOf("i",14));
		
		
		// Soru:
		// i harfi cümleninn (metnin) yarısından itibaren ilk geçtiği yerin indexi nedir?
//		System.out.println("i metnin yarısından itibaren ilk nerede geçiyor?" + metin.indexOf("i", (metin.length()/2)));
		
		
		// substring
		// substring(baslangıc index, bitiş index) -> başlangıç dahil - bitiş dahil değil
		// Gets substring of a string
		// "Bugün Java ile string konusunu işleyeceğiz"
//		System.out.println("Metnin ilk 5 karakteri: " + metin.substring(0,5)); // 0 dahil, 5 dahil değil. 0,1,2,3,4. karakterleri alır.
		
		
		// Soru:
		// Metindeki Java ifadesini substring ile çekin
		System.out.println("Java kelimesinin geçtiği yer: " + metin.substring(6,10));
		
		// Soru:
		String test = "Test 1234";
		System.out.println(test.substring(2,7)); // ne yazar? st 12
		
		// 2. kullanım şekli:
		System.out.println(test.substring(5)); // 1234 yazar...
		
		//*********
		//
		// trim
		// Bir string'in başındaki ve sonundaki boşlukları(space) siler.
		
		String cumle = "Hello Java";
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);
		// Kullanıcı adı şifre yazan uygulamalarda trim kullanmazsanız sorun yaşayabilirsiniz.
		
		
		//**********
		//
		// toUpperCase ve toLowerCase
		//
		// Metnin içindeki harflerin case'ini değiştirmeye yarar.
		metin = "Hello Java";
		System.out.println(metin.toLowerCase());  // hello java
		System.out.println(metin.toUpperCase());  // HELLO JAVA
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}