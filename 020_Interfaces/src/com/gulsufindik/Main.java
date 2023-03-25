package com.gulsufindik;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + " " + tarihSaatGosterenCihaz.saatGoster());
	}

	// Interface'ler abstraction (soyutlama) sağlar
	public static ITermometre termometreOlustur() {
		ITermometre termometre = new Arzum();
		return termometre;

	}

	public static void main(String[] args) {

		Arzum arzum = new Arzum();
		System.out.println(arzum.sicakligiOlc());

		ITermometre termometre = new Arzum();
		System.out.println(termometre.sicakligiOlc());

		Sinbo sinboCihaz = new Sinbo();
		sinboCihaz.sicakligiOlc();
		sinboCihaz.nemOlc();
		// List <String> mylist = new LinkedList<String>();

		Main.tarihSaatGoster(arzum);
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());

	}

}
