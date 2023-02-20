package com.gulsufindik;

import java.util.Scanner;

public class SinifStaticDegiskenlerTest {



	private static int aktifKullaniciSayisi;
	public static void aktifKullanıcıSayisiniArttir() {
		SinifStaticDegiskenlerTest.aktifKullaniciSayisi++;
	}public static int aktifKullanıcıSayisiniGetir() {
		return SinifStaticDegiskenlerTest.aktifKullaniciSayisi;
	}

	public void staticOlmayanMetod() {
		System.out.println("Static olmayan metoddan merhaba !");
	}
	public static void main(String[] args) {
		SinifStaticDegiskenlerTest.aktifKullaniciSayisi++;
		SinifStaticDegiskenlerTest.aktifKullaniciSayisi++;
		System.out.println(SinifStaticDegiskenlerTest.aktifKullaniciSayisi);
		System.out.println(SinifStaticDegiskenlerTest.aktifKullanıcıSayisiniGetir());
	
	
	
	//Kural 
		//Static olmayan metodları static metodlar içinden direk çağıramazsın
		//staticOlmayanMetod();  => Hata verir
		
		
//		Scanner sc = new Scanner(System.in);
//		int b = sc.nextInt();
//	
	}

}