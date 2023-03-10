package com.gulsufindik;

public class VeriTipleriTamSayilar {

	public static void main(String[] args) {
//		System.out.print("Hello Java 1");
//		System.out.println("Hello Java 2");
//		System.out.print("Hello Java 3");

		System.out.println("Hello" + " " + "Java");

		// Değişken tanımlama ve ilkel(Primitive) Veri Tipi

		byte byteValue; // 1 Byte
		byte ogrenciSayisi; // Doğru
		byte maxURLSayisi = 100; // camelCasing'e uygun.

		// Yanlış tanımlamalar;
		// byte ogrenci Sayisi;
		// byte *ogrenciSayisi;
		// byte öğrencisayısı;
		// byte 1ogrenciSayisi; ogrenciSayisi1 -> Doğru

		byteValue = 1;
		System.out.println(byteValue);

		// 11111111 00000000
		// ^: Sign bit
		// En soldaki bit sign biti olarak görev görür.
		// 0 ise pozitif sayı. Örn: 00000001= 1 00000011= 3 01111111= 127
		// 10000000= -128 10000001= -128+1= -127 10000010: -126 11111111= -1
		// Byte'ın alabileceği değerlerin aralığı= -128 ile 127
		//

		// SHORT : 2 BYTE
		// -2^15 ile 2^15-1
		// -32,768 ile 32,767
		short shortValue = 22;
		short shortVal1 = 30, shortVal2 = 244, shortVal3 = 55;

		// Büyük ilkel veritip = küçük ilkel veritip diyebiliriz, ancak tersini
		// yapamayız
		shortValue = byteValue; // ok

		// byteValue = shortValue; -> Direk olarak bu şekilde atama yapamayız casting
		// gerekiyor..
		byteValue = (byte) shortValue; // (byte) = casting işlemi yapabilirsiniz.
		System.out.println(byteValue);

		// peki shortValue 127den büyük olsaydı ne olurdu?
		shortValue = 129; // 00000000 10000001 =129 Ama Byte için 10000001= -127 anlamı ifade eder.
							// Yanlış işlem yapmış oluruz.
							// dolayısıyla byte'ın alabileceği max değerler dışında kullanmayınız.
		byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue); // tırnak içinde metin + değer şeklinde yazılır

		// int: 4 Byte
		// -2^31 ile 2^31-1
		// -2147483648 ile 2147483647
		System.out.println(Integer.MIN_VALUE); // Integer= Wrapper class'lar
		System.out.println(Integer.MAX_VALUE); // Integer= Wrapper class'lar

		int intValue = 7;
		int i1, i2, i3;
		i1 = 0;
		i2 = 5;

		intValue = shortValue;
		// shortValue = intValue; Bu da aynı şekilde hata verir...

		// Byte Toplama
		byteValue = 127;
		byte b2;
		// b2 = byteValue + byteValue; hata verir. neden?
		// Çünkü Java byteValue + byteValue sonucunu int' otomatik atar.

		b2 = (byte) (byteValue + byteValue);
		System.out.println(b2);

		short sh1 = 3;
		short sh2 = 2;
		short sh3;
		// sh3 = sh1 + sh2; // yine hata verir casting lazım. Casting işlemi yaparken
		// Java insiyatifi bize bırakır.
		// Değerleri bizim kontrol etmemiz lazım toplam değerin short değeri geçmemesi
		// lazım
		sh3 = (short) (sh1 + sh2); // int'e kadar bu tarz hatalar alırsınız. İnt'ten sonra bu tarz hatalar
									// almazsınız.
		System.out.println("sh3: " + sh3);

		int x1 = 33;
		int x2 = 44;
		int x3;
		x3 = x1 + x2; // Sorun yok!
		System.out.println("x3: " + x3);

		// LONG= 8 Byte (Long veri tipi)
		// -2^63 ile 2^63-1
		System.out.println("\n\nMin Long Değeri: " + Long.MIN_VALUE);
		System.out.println("\n\nMax Long Değeri: " + Long.MAX_VALUE);
		long longValue = 7;
		System.out.println(longValue);

		// longValue = 95568584185421421; bu şekilde sağ taraf int'in sınırını geçerse
		// atamada hata alırsınız!
		longValue = 95568584185421421L; // L harfini kullanarak sorun çözülür !

		// Şu tarz hatalar da olabilir:
		// long mytimer = 64453435443 * 2; hatalı
		// hatayı düzeltmek için L ekleyin:
		long mytimer = 64453435443L * 2;

		// Şu tip hatalar da olabilir.
		int carpan = 100000;
		long carpim = carpan * carpan;
		System.out.println("çarpım: " + carpim); // yanlış sonuc verir. Çünkü sağ taraftaki int sorunu burda da yaşandı.
		// çözüm: çarpılan sayıların ilkine long tipinde bir sayı eklenirse sağ taraf
		// long olur:
		carpim = 1L * carpan * carpan;
		System.out.println("çarpım: " + carpim);

		// long altçizgi kullanımı
		long x = 123_234_567L;
		System.out.println("x: " + x);
	}

}
