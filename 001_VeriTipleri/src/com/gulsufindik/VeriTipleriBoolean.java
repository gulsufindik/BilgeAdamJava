package com.gulsufindik;

public class VeriTipleriBoolean {

	public static void main(String[] args) {

		// bool veritipi :
		// 1 bit
		// açık-kapalı, doğru-yanlış, 1-0, ...

		// boolean olarak neler tutabilir?
		// Ör. Bir kullanıcının sistemde aktif olup olmadığını tutabilirsiniz (online
		// veya offline durumu)

		boolean boolDegisken;
		boolDegisken = true; // true veya false olarak sadece 2 değerden birini alabilir..
		System.out.println(boolDegisken);

		// boolean isHeavy = false;
		boolean agirMi = false; // initialize - ilk değer verme
		int agirlik = 70;
		agirMi = agirlik >= 85;
		System.out.println("Ağır mı: " + agirMi);

		// == != >= <= < >
		boolean durum = (agirlik == 50);
		System.out.println("Durum: " + durum);

		durum = agirlik != 50;
		System.out.println("Durum:" + durum);

		int boy = 180;
		boolean uzunKilolu = (boy >= 180 && agirlik >= 85);
		System.out.println("Şahıs uzun ve kilolu mu? :" + uzunKilolu);

		// Soru:
		char cinsiyet = 'K'; // 'E'
		if (uzunKilolu && cinsiyet == 'K') {
			System.out.println("Şahıs kadın, uzun ve kilolu");
		}

		// Örnek:
		int yas = 19;
		String deger;
		if (yas >= 18) {
			deger = "Yetişkin";
		} else {
			deger = "Yetişkin değil";
			System.out.println(deger);
		}

		// yukardaki işlemin Ternary ile yapılması:
		yas = 11;
		deger = yas >= 18 ? "Yetişkin" : "Yetişkin";
		System.out.println(deger);

		// microsoft USA'in Mülakatında sorduğu sınav sorusu (SAWP Numbers QUESTİON) :
		// 3. değişken kullanmadan sayi1 ve sayi2 sayılarını birbirine eşit olacak
		// şekilde değiştirin.
		int sayi1 = -5;
		int sayi2 = 3;

		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;

		System.out.println(sayi1);
		System.out.println(sayi2);

		int x = 10;
		int y = 3;

		int result = x / y;
		System.out.println(result);
		int kalan = x % y;
		System.out.println(kalan);

		double res = x / y;
		System.out.println("res: " + res); // yine küsürat gözükmez çünkü eşitliğin sağ tarafı tamsayılarda hep int olur

		// Çözüm:
		// x ve y double olmalı
		double xx = 10;
		double yy = 3;
		res = xx / yy;
		System.out.println("res: " + res);

		// Küsüratı azaltıp gösterelim
		String kusurat = String.format("%.3f", res);
		System.out.println("res:" + kusurat);

		System.out.println("\n\n----------");
		int sayisalDeger = 4;
		sayisalDeger = sayisalDeger + 1;
		System.out.println("sayısal değer:" + sayisalDeger);

		// +_ ++ -- -_ ...
		sayisalDeger += 1;
		System.out.println("sayısal değer: " + sayisalDeger);

		sayisalDeger++;
		System.out.println("sayısal değer: " + sayisalDeger);

		sayisalDeger += 5;
		System.out.println("sayısal değer: " + sayisalDeger);

		sayisalDeger--;
		System.out.println("sayısal değer: " + sayisalDeger);

		// *= /= %= yukarıdaki mantığa benzer şekilde çalışır...

//		int a = 3;
//		int b = a++; // DİKKAT! Önce atamayı yapar, sonra ++ işlemini gerçekleştirir. a++ -> a = a+1
//		System.out.println("a: "+ a + " b: " + b);
//		
//		int a = 3;
//		int b = a++; // önce a: 4 daha sonra b:4
//		System.out.println("a: "+ a + " b: " + b);

		int a = 3;
		int b = 4;
		int z = 5;
		// int tpl = a++ + ++b + --z // tpl: 3+5+4=2 a:4 b:5 z:4
		int tpl = a++ + ++b + --z + b; // tpl: 3+5+4=12 a:4 b:5 z:4
		System.out.println("tpl: " + tpl);
		System.out.println();
	}
}
