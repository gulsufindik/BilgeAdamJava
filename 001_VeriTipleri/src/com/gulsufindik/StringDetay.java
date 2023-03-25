package com.gulsufindik;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {

//		String metin = "Naber?";
//		Scanner input = new Scanner(System.in);
//		metin = input.nextLine();
//		System.out.println(metin);

		// 0 1 2 3 4 5 6 7 8 9 10 11 ...
		// {'B','u','g','u','n',' ','J','a','v','a',' ','i',......'z'} --> char dizisi
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		String tekharf = "a"; // char[] dizi -> {'a'} -> Java bunu 1 elemanlı char dizisi olarak tutar..

		// String en çok kullanılan metodları/fonksiyonları:

		// length methodu:
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
		// java kelimesi ilk nerede geçiyor?
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
		// i harfi cümleninn (metnin) yarısından itibaren ilk geçtiği yerin indexi
		// nedir?
//		System.out.println("i metnin yarısından itibaren ilk nerede geçiyor?" + metin.indexOf("i", (metin.length()/2)));

		// substring
		// substring(baslangıc index, bitiş index) -> başlangıç dahil - bitiş dahil
		// değil
		// Gets substring of a string
		// "Bugün Java ile string konusunu işleyeceğiz"
//		System.out.println("Metnin ilk 5 karakteri: " + metin.substring(0,5)); // 0 dahil, 5 dahil değil. 0,1,2,3,4. karakterleri alır.

//		// Soru:
//		// Metindeki Java ifadesini substring ile çekin
//		System.out.println("Java kelimesinin geçtiği yer: " + metin.substring(6,10));
//		
//		// Soru:
//		String test = "Test 1234";
//		System.out.println(test.substring(2,7)); // ne yazar? st 12
//		
//		// 2. kullanım şekli:
//		System.out.println(test.substring(5)); // 1234 yazar...
//		
//		//*********
//		//
//		// trim
//		// Bir string'in başındaki ve sonundaki boşlukları(space) siler.
//		
//		String cumle = "Hello Java";
//		System.out.println(cumle);
//		cumle = cumle.trim();
//		System.out.println(cumle);
//		cumle = cumle.trim();
//		System.out.println(cumle);
//		// Kullanıcı adı şifre yazan uygulamalarda trim kullanmazsanız sorun yaşayabilirsiniz.
//		
//		
//		//**********
//		//
//		// toUpperCase ve toLowerCase
//		//
//		// Metnin içindeki harflerin case'ini değiştirmeye yarar.
//		metin = "Hello Java";
//		System.out.println(metin.toLowerCase());  // hello java
//		System.out.println(metin.toUpperCase());  // HELLO JAVA
//		
//		// Soru: (sınav sorusu)
//		// Aşağıdaki çıktıyı ekrana yazdıran bir döngü yazınız:
//		
//		/*
//		  
//		 *
//		 * *  
//		 * * *
//		 * * * * 
//		 * * * * * 
//		 * * * * * * 
//		 * * * * * * *
//		 
//		 */
//		
//		 String s = "*" ;
//		 for (int i=0 ; i<7; i++) {
//			 System.out.println(s);
//			 s += " *";
//		 }
//		
//		// valueOf Metodu
//		// converts different types of values to String
//		// farklı veri tiplerini String veritipine çevirir.
//		 
//		int sayi = 2233;
//		String ss = String.valueOf(sayi);
//		System.out.println(ss);
//		
//		boolean flag = true;
//		ss = String.valueOf(flag);
//		System.out.println(ss);
//		
//		// equals metodu
//		
//		String uname = "gsungur@test.com"; // DB'de loginname bu şekilde tutuluyor diyelim
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen kullanıcı adınızı giriniz: ");
//		String userName = input.nextLine();
//		
//		userName = userName.toLowerCase().trim();
//		
//		// Stringleri bu şekilde == ile karşılaştırma yapmayın !!!
////		if (userName == uname ) {
////			System.out.println("Kullanıcı adı eşleşti");
////		} else {
////			System.out.printlen("Kullanıcı adı eşleşmedi!!!!");
////		}
//		
//		if(userName.equals(uname)) {
//			System.out.println("Kullanıvı adı eşleşti");
//		} else {
//			System.out.println("Kullanıcı adı eşleşmedi!!!!");
//		}

		// equalsIgnoreCase metodu
		// Metin karşılaştırması yaparken küçük harf ve büyük harf ayrımını dikkate
		// almaz

		String isim1 = "Vedat";
		String isim2 = "vedat";

		if (isim1.equalsIgnoreCase(isim2)) {
			System.out.println("isimler eşleşti");
		} else {
			System.out.println("isimler eşleşmedi!!!");
		}

		// replace metodu
		String s2 = "Şahin yırtıcı bir kuştur";
		String s3 = s2.replace("Ş", "s");
		System.out.println(s3);

		// Nerelerde kullanılır?
		// 1.Örnek: Kira sözleşmesi...
		String sozlesme = "Ali kaya Güneş sokak Çankaya mah. adresindeki evini Ayşe Naz'a kiraladı...";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yeniSozlesme);

		// 2.kullanım:
		// web url'lerinde türkçe karakterlerde sorun çıkabiliyor...
		// Örn. https://www.isbasvuru.com//alikaya iş başvuru.pdf -> sıkıntı çıkar
		String dosyaAdi = "http://www.isbasvuru.com/alikaya iş başvuru.pdf";
		// Boşluk karakterini - ile değiştirin, Türkçe karakterleri ingilizce ile
		// değiştirin...
		dosyaAdi = dosyaAdi.replace(" ", "-").replace("ş", "s").replace("ü", "u");
		System.out.println(dosyaAdi);

		// contains metodu:
		// Herhangi bir substringin hedef string içinde varolup olmadığını kontrol eder.
		String yeniMetin = "Hava bugün çok yağmurlu";
		System.out.println("ağ kelimesi var mı?" + yeniMetin.contains("ağ"));
		System.out.println("ağ kelimesi var mı?" + yeniMetin.contains("tağ"));

		if (yeniMetin.contains("yağmur")) {
			System.out.println("Hava durumunda bugün yağmur görünüyor!");
		} else {
			System.out.println("Bugün yağmur yok");
		}

		// startsWith
		String ad = "Ali Kaya";
		System.out.println(ad.startsWith("A")); // -> True
		System.out.println(ad.startsWith("Ali")); // -> True
		System.out.println(ad.startsWith("li")); // -> False

		// split
		// verilen ifadeye göre metni böler. [] : dizi/array simgesi
		String liste = "Ali, Burcu, Ayşe, Zeynep, Kaan";
		String[] isimler = liste.split(","); // String dizisi yapar: String[] isimler =
												// {"Ali","Burcu","Ayşe","Zeynep","Kaan"}
		System.out.println(isimler[0]);
		System.out.println(isimler[2]);
		System.out.println(isimler[isimler.length - 1]);

//		System.out.println();
//		for(int i=0; i<isimler.length;i++) {
//			System.out.println(isimler[i]);
//		}

		System.out.println();
		// Örnek:
		// Öğrencilerin listesi String olarak tutuluyor olsun. Nasıl ayrıştırırız ?
		String ogrencilerStr = "Ali Kaya, 123; Veli Öz, 222; Zeynep Naz, 342";
		String[] ogrenciler = ogrencilerStr.split(";"); // ogrenciler = {"Ali Kaya,123","Veli Öz,222",...}
		System.out.println(ogrenciler[0]);
		System.out.println(ogrenciler[1]);
		System.out.println(ogrenciler[ogrenciler.length - 1]);

		// peki ilk öğrencinin okul numarasını ekrana yazalım:
		// System.out.println(ogrenciler[0].split(";")[1]); // {"Ali Kaya","123"}
		// ogrenciler[0] -> "Ali Kaya, 123"
		String[] ogrenciBilgileri = ogrenciler[0].split(","); // ogrenciBilgileri -> {"Ali Kaya","123"}
		System.out.println(ogrenciBilgileri[0]);
		System.out.println(ogrenciBilgileri[1]);

		// Veli'nin okul numarasını yazdıralım:
		String[] ogrenciBilgileriVeli = ogrenciler[1].split(","); // { "Veli Öz", "222"}
		System.out.println(ogrenciBilgileriVeli[1]);
		// int ogrNo = Integer.parseInt(ogrenciBilgileriVeli[1]);

		// Veli'nin sadece ismini yazdıralım
		String[] ogrenciVeliIsim = ogrenciBilgileriVeli[0].split(" "); // {"Veli", "Öz"}
		System.out.println(ogrenciVeliIsim[0]);

		// stringbuiler kullanımı

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Merhaba");
		stringBuilder.append(" Dünya");
		stringBuilder.append(" Java!");
		System.out.println(stringBuilder);

		// String karşılaştırma konusu detayı:
		System.out.println("\n******\n");

		String x = "Ali";
		String y = "Veli";

		if (x == y)
			System.out.println("Eşit");
		else
			System.out.println("Eşit Değil");

		String z = "Ali";
		if (x == z)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");

		String w = "Ali".trim();
		System.out.println(w);
		if (x == w)
			System.out.println("w ve x Eşit");
		else
			System.out.println("w ve x eşit değil");

		// çok deikkatli olmak lazım
		// string içerik karşılaştırmalarında mutlaka equals metodu kullanılmalıdır!!
		// sınavlarda/ mülakatlarda çok sorulan sorulardan biridir.

		if (w.equals(x))
			System.out.println("eşit");
		else
			System.out.println("eşit değil");

	}

}
