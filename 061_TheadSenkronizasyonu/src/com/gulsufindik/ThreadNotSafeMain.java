package com.gulsufindik;

import javax.management.RuntimeErrorException;

public class ThreadNotSafeMain {

	private int count = 0;

	public void threadleriCalistir() {
		Thread thead1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
				}
				System.out.println("Thread1 is over");

			}

		});

		Thread thead2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					count++;
				}
				System.out.println("Thread2 is over");

			}

		});
		
		thread1.start();
		thread2.start();
		
		try {
		thread1.join();
		thread2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
		
		// bu şekilde çalıştırınca 10000 yazmaz - çünkü şuanda senkron çalışmıyorlar
		// count++ ili iki thread de aynı anda count değişkenine erişmeye çalışıyrlar
		// 10000-9156 = 844 farkı bu iki threadin aynı anda count değerini alıp artırmaya çalışmış olmalarının sonucudur. Bu tarz uygulamalar threadnosafe denir.
		// bunun çözümü senkronizasyon yapmaktır.
		System.out.println("count değişkeninin son değeri: " +count);
	}

	public static void main(String[] args) {
		
		ThreadNotSafeMain main = new ThreadNotSafeMain();
		main.threadleriCalistir();

	}

}
