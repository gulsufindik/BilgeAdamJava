package com.gulsufindik;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter ile sadece text dosyları oluşturulabilir
// write() metodunun içine direk String verilebilir
public class Main {

	public static void main(String[] args) {
		
		FileWriter filewriter = null;
		
		try {
		fileWriter = new FileWriter("dosya.txt", true);
		
		// FileWrite ile dosyaya veriyi byte'a çevirmeden direk String olarak yazılabilir
		fileWrite.write("Bartu Sungur");
		fileWrite.write("Ahmet Ozan");

	} catch (IOException e) {
		System.out.println("Dosya açılırken veya yazarken hata oluştu");
		e.printStackTrace();
	} finally {
		if (fileWriter )
	}

}
