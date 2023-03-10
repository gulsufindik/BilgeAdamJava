package com.gulsufindik;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main thread çalışıyor");
		
		Yazici yaziciThread1 = new Yazici("Yazıcı thread-1");
		Yazici2 yaziciThread2 = new Yazici2("Yazıcı thread-2");
		
		yaziciTread1.start();
		yaziciTread2.start();
		
		try {
			yaziciThread1.join();
			yaziciThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
