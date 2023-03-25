package com.gulsufindik;

public class Test {
	
	private Object lock = new Object();
	
	public void thread1Metod() {
		
		synchronized (lock) {
			System.out.println("Thread1 is running..");
			System.out.println("Thread1 waits..");
			
			try {
				lock.wait(); // wait ile diyoruz ki ben uyuyacağım lock ı bırakıyorum isteyen alabilir
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// işlemler...
			System.out.println("Thread1 is awake and continues...");
			
			
		}
	}
	
	public void thread2Metod() { 
		
		Thread.sleep(3000);
	}

}

