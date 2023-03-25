package com.gulsufindik;

// Thread oluşturmada 2.yöntem : Runnable interface'ini implement edin!

public class Thread3 implements Runnable {

	private String name;

	public Thread3(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name + " isimli thread çalışıyor..");
		for (int i = 0; i <= 50; i+=7) {
			System.out.println(this.name + " yazıyor.. " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
		}
		System.out.println(this.name + " isimli thread işini bitirdi, çıkıyor..");

	}

}

