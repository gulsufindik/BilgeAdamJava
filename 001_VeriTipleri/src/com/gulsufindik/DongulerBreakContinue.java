package com.gulsufindik;

public class DongulerBreakContinue {

	public static void main(String[] args) {
		
		// break
		// döngünün  akışını durdurur ve } sonrasındaki koda gider...
		
//		for(int i=0; i<10; i++) {
//			if (i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("See u later...\n\n");
		
		
		// continue
		// Döngünün dışına çıkarmaz ancak bir sonraki indekse devam ettirir.
		
//		for(int i=0; i<10; i++) {
//			if (i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		// Örnek
		int sayac = 0;
		while (sayac < 10) {
			if (sayac == 7)
				break;
			sayac++;
			System.out.println(sayac);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
