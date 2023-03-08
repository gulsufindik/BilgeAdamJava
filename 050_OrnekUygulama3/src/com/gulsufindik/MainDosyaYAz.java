package com.gulsufindik;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainDosyaYAz {

	public static void main(String[] args) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))) {
			
			Otomobil oto1 = new Otomobil("Renault", "clio",2022);
			Otomobil oto2 = new Otomobil("Renault", "clio",2022);
			Otomobil oto3 = new Otomobil("Renault", "clio",2022);
			Otomobil oto4 = new Otomobil("Renault", "clio",2022);
			
			Motor m1 = new Motor(1111);
			oto1.setMotor(m1);
			
			Motor m2 = new Motor(2222);
			oto2.setMotor(m2);
			
			Motor m3 = new Motor(3333);
			oto3.setMotor(m3);
			
			Motor m4 = new Motor(4444);
			oto4.setMotor(m4);
			
//			out.writeObject(oto1);
//			out.writeObject(oto2);
//			out.writeObject(oto3);
//			out.writeObject(oto4);
			
			ArrayList<Otomobil> otoList = new ArrayList<Otomobil>();
			otoList.add(oto1);
			otoList.add(oto2);
			otoList.add(oto3);
			otoList.add(oto4);
			
			out.writeObject(otoList);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası");
			e.printStackTrace();
		}
		
		System.out.println("Process complete");
	

	}

}
