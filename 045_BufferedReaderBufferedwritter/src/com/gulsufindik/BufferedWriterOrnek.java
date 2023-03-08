package com.gulsufindik;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek {

	public static void main(String[] args) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt,ture"))) {
			
			writer.write("Özgür Öz, 443\n");
			writer.write("Özgür Öz, 443\n");
			writer.write("Özgür Öz, 443\n");
			writer.write("Özgür Öz, 443\n");
			writer.flush(); // flush kullanımı opsiyonel: Siz flush() yazarsanız buffer'da o ana kadar birikeb verilr stream'e yazılır
			// siz eğer flush kullanmazsanız buffer belli bir doluluğa ulaşınca veya belli bir zaman periyodunda otomatik olarak java tarafından flushlanır
			
			writer.write("Özgür Öz, 443\n");
			writer.write("Özgür Öz, 443\n");
			writer.write("Özgür Öz, 443\n");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("dosyaya yazma hatası");
			
			
		} catch (IOException e) {
			System.out.println("I/O exceptionn - hatası");
			e.printStackTrace();
		} 
		
		System.out.println("bye");

	}

}
