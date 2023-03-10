package com.gulsufindik;

// Thread oluşturmada 2.yöntem : Runnable interface'ini implement edin!

public class Yazici2 implements Runnable {

	private String isim;

	public Yazici2(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Yazici [isim=" + isim + "]";
	}

	@Override
	public void run() {
		System.out.println(this.isim +" isimli thread çalışıyor");
		
		for (int i=1; i<=5 ; i++) {
			System.out.println(this.isim+ " yazıyor: "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
