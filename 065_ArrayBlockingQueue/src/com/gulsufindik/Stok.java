package com.gulsufindik;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stok {
	
	Random random = new Random();
	ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10); // capacity : 10 (yani max 10 tane eleman tutabilir)
																	// İçinde multi-lockla sayesinde thread- sade bir yapıdır
	// produs() metodu random bir sayı üretip queue'ya ekleyecek
	public void produce() {
		while(true) {
			Integer val = random.nextInt(1000);
			
			try {
				queue.put(val);
				System.out.println("producer stoğa mal ekliyor: "+ val);
				System.out.println("Stoğun güncel size: "+ queue.size());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	// consumer() metodu : stoktan integer değer çekip tüketir.
	
	public void consume() {
		while(true) {
			try {
				Thread.sleep(1000);
				
				Integer val;
				val = queue.take();
				System.out.println("Consumer stoktan mal tüketiyor: "+ val);
				System.out.println("Stoğun güncel size "+ );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
