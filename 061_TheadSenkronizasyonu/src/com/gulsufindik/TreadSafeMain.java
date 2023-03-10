package com.gulsufindik;

public class TreadSafeMain {

	private int count = 0;

	// synchronized metodları aynı anda sadece bir tread çalıştırabilir
	// oda- anahtar(kilit) mekanizması gibi düşünün metoda ilk giren thread odayı
	// kitler ve anahtarı alır (lock'ı alır)
	// Bu şekilde yaptığımız zaman uygulamamız artık Thread-Safe olmuş olur
	public synchronized void threadlerBurayaSenkronOlarakGirer() {
		count++;
	}

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

		System.out.println("count değişkeninin son değeri: " + count);
	}

	public static void main(String[] args) {
		ThreadSafeMain

	}

}
