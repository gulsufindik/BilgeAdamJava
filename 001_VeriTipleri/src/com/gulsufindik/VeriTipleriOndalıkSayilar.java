package com.gulsufindik;

public class VeriTipleriOndalıkSayilar {

	public static void main(String[] args) {

		// float 4 Byte
		// Precision (noktadan sonraki hassasiyet) : 7 decimal (ondalık) digits.
		// Bilimsel hesaplamalarda kullanırsanız veri kaybedebilirsiniz sonuç yanlış
		// çıkabilir.
		// Fizikçiler ve kimyacılar atomla molekülle uğraşanlar kullanmaz.

		float floatValue = 1.2f;
		System.out.println("floatValue: " + floatValue);
		System.out.println("float min: " + Float.MIN_VALUE);
		System.out.println("float max: " + Float.MAX_VALUE);

		floatValue = 22;
		System.out.println(floatValue);
		floatValue = 22.4f; // ondalık sayılarda default atama sağ taraf değeri double

		// double 8 Byte
		// Precision (noktadan sonraki hassasiyet) : 15 decimal (ondalık) digits.
		double doubleValue = 1.2;
		doubleValue = 656556565565.698632145878965;
		System.out.println("Double Min: " + Double.MIN_VALUE);
		System.out.println("Double Max: " + Double.MAX_VALUE);

		doubleValue = 2345.55778;
		doubleValue = 12.334e8;
		System.out.println(doubleValue);

		// Örnek:
		doubleValue = 23.123456789;
		floatValue = (float) doubleValue;
		System.out.println(floatValue);

		floatValue = 1.1234567F;
		System.out.println(floatValue);

		String kusuratliSayi = String.format("Sayı: %.2", floatValue);
		System.out.println(kusuratliSayi);

		final int maxOgrencisayisi = 24;
		System.out.println(maxOgrencisayisi);

	}
}
