package com.gulsufindik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainDosyayıOku {

	public static void main(String[] args) {
		
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("otomobil.bin"))) {
			// yazdığımız sıra ile okuma işlemini yapmamız gerekiyor
//			Otomobil otomobil1 = (Otomobil) input.readObject(); 
//			Otomobil otomobil2 = (Otomobil) input.readObject(); 
//			Otomobil otomobil3 = (Otomobil) input.readObject(); 
//			Otomobil otomobil4 = (Otomobil) input.readObject(); 
//			
//			System.out.println(otomobil1);
//			System.out.println(" Motor no: " + otomobil1.getMotor().getMotorNo());
//			System.out.println(otomobil2);
//			System.out.println(" Motor no: " + otomobil2.getMotor().getMotorNo());
//			System.out.println(otomobil3);
//			System.out.println(" Motor no: " + otomobil3.getMotor().getMotorNo());
//			System.out.println(otomobil4);
//			System.out.println(" Motor no: " + otomobil4.getMotor().getMotorNo());
			
			ArrayList<Otomobil> otomobilList = (ArrayList<Otomobil>)input.readObject();
			
			for (Otomobil oto : otomobilList) {
				System.out.println(oto);
				System.out.println("Motor no: " + oto.getMotor().getMotorNo());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
