package com.gulsufindik;

// Interface'ler kullanılakta oluşturulabilir
public class Main {

	public static void main(String[] args) {
		
		IUcabilir ucanKaz = new IUcabilir() {
			
			public void uc() {
				System.out.println("Kaz ucuyor");
			}
		};
		
		ucanKaz.uc();
		
		IUcabilir serce = new IUcabilir() {
			
			public void uc() {
				System.out.println("Kaz ucuyor");
			}
		};

	}

}
