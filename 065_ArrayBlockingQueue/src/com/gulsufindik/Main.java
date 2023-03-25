package com.gulsufindik;

public class Main {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				stock.produce();
				
			}
			
		});
		
		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				stock.consume();
				
			}
			
		});
		
		producer.start();
		// Stoctaa biraz mal biriksinn istiyoruz
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//bir süre sonra consumer thread malları tüketmeye başlar
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
