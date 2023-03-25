package com.gulsufindik.ThreadliListeYazici;

import java.util.ArrayList;
import java.util.Random;

public class ThreadliListeYazici {
	
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	Random random = new Random();
	
	public synchronized void list1DegerEkle() {
		
	
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	
	public void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
	}
	
	public void listelereDegerEkle() {
		for (int i=0; i<1000; i++) {
			list1DegerEkle();
			list1DegerEkle();
		}
		
	}

	public void threadlerOlustur() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				listelereDegerEkle();

			}
			
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				listelereDegerEkle();		
				}
				
			});	
		
		long baslangic = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "list1 size: " +list1.size()+ "list2 size :"+ list2.size() );
		
	}
	
	
	

}
