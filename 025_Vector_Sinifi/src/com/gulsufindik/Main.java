package com.gulsufindik;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// Multi -threading applicationlarda ArrayListler safe kabul edilmez 
		//bir programın aynı anda bieden çok iş yapabilmesine denir
		
		// Multi threading uygulamalarda ArrayList yerine Vector kullanılmalıdır. Vector sınıfı therad safe bir sınıftır.
		// Vectorlerin dezavantajı ise ArrayListlere göre daha yavas çalışmaktadır
		
		List<String> vector = new Vector<String>();
		
		vector.add("Kedi");
		vector.add("Köpek");
		vector.add("Kuş");
		vector.add("Kartal");
		
		for(String s :vector) {
			System.out.println(s);
		}
		
		// Iterator kullanımı;
		System.out.println();
		
		ListIterator<String> iterator = vector.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
