package com.gulsufindik;

public class DiziOrnekleri {

	public static void main(String[] args) {

		// soru:
		int[] dizi = { -4, 7, 12, 78, -32, 122, 0, 9 };
		// Bu dizinin ortalamasını tamsayı cinsinden bulunuz

		// ortalama = sayıların toplama / sayı_adedi
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println("Ortalama: " + toplam / dizi.length);

		// int eşitlerken yuvarlama yapması
		int x = 20;
		int g = x / 3;
		int y = 3;
		double v = x / (y * 1.0);
		System.out.println("v: " + v);

		// küsüratlarla ilgili Jva Math kütüphanesi kullanımı
		System.out.println(Math.round(v));
		System.out.println(Math.round(1.4));

		// En küçük ve En büyük Sayıyı Bulma (önemli)

		// soru
		// bir dizi içindeki en büyük sayıyı bulmak için en baştaki sayıyı en büyük sayı
		// kabul edip
		// dizi içindeki bir sonraki sayı ile kıyaslayın
		// eğer kıyasladığımız sayı daha büyükse en büyük sayı o olsun. değilse
		// değişiklik yapmayalım
		// dizideki tüm sayıları bu şekilde kontrol edelim.
		// {-4,7,12,78,-32,122,0,9 }
		int enBuyukSayi = dizi[0];
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukSayi < dizi[i]) {
				enBuyukSayi = dizi[i];
			}
		}
		System.out.println("Dizi içindeki en büyük sayı: " + enBuyukSayi);

		// En küçük sayıyı bulunuz
		int enKucukSayi = dizi[0];
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enKucukSayi > dizi[i]) {
				enKucukSayi = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizi içindeki en küçük sayı: " + enKucukSayi + " en küçük sayının indexi: " + index);

	}

}
