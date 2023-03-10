package com.gulsufindik;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main thread çalışıyor");
		
		Thread printer1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread-1 çalışıyor");
				for (int i=1; i<=5; i++) {
					System.out.println("Thread-1 yazıyor: "+ i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} System.out.println("Thread-1 çıkıyor");
				
			}
			
		});
		
		Thread printer2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread-2 çalışıyor");
				for (int i=1; i<=5; i++) {
					System.out.println("Thread-2 yazıyor: "+ i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} System.out.println("Thread-2 çıkıyor");
				
			}
			
		});
		
		printer1.start();
		printer2.start();
		
		System.out.println("Main thread çıkıyor");
		
			
		

	}

}
