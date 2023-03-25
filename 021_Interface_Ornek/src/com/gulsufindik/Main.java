package com.gulsufindik;

public class Main {
	
	// Polymorphizm over Interfaces
	public static void kisaSureliUc(IUcabilir kus) {
		kus.kanatCirp();
	}
	
	// polymorphizm over Interitance
	public static void hayvan2kezSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
		hayvan.sesCikar();
	}
	
	
	
	public static void main(String[] args) {

	//IUcabilir beyazPacaliGuversin = new Guvercin ("Beyaz paçalı", 1,12);
	beyazPacaliGuvercin.gagala("yem");
	
	//IUcabilir serce = new Serce("Minik Serçe",1,8);
	serce.gagala("yem");
	
	
	AnkaraKedisi kedi = new AnkarKedisi("Tekir",s,40);
	Main.kisaSureliUc(beyazPacaliGuvercin);
	Main.kisaSureliUc(serce);
	
	
	
	
	}

}
