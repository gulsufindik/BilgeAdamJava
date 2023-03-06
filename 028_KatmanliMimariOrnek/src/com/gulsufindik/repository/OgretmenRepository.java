package com.gulsufindik.repository;

import java.util.List;

import com.gulsufindik.repository.entity.Ogrenci;
import com.gulsufindik.repository.entity.Ogretmen;
import com.gulsufindik.utility.DataBase;

public class OgretmenRepository {

	public void save(Ogretmen ogretmen) {
		DataBase.ogretmenListesi.add(ogretmen);
	}

	public void delete(int id) {
		Ogretmen silinecekOgretmen = null;
		for (Ogretmen ogr : DataBase.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				silinecekOgretmen = ogr;
				break;
			}
		}

		if (silinecekOgretmen != null) {
			DataBase.ogretmenListesi.remove(silinecekOgretmen);
		}
	}

	public void update(Ogretmen ogretmen) {
		for (int i = 0; i < DataBase.ogretmenListesi.size(); i++) {
			if (DataBase.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo()) {
				DataBase.ogretmenListesi.get(i).setAd(ogretmen.getAd());
				DataBase.ogretmenListesi.get(i).setSoyad(ogretmen.getSoyad());
			}

		}
	}

	public Ogretmen findById(int id) {
		Ogretmen tempOgretmen = null;
		for (Ogretmen ogr : DataBase.ogretmenListesi) {
			if (ogr.getTcKimlikNo() == id) {
				tempOgretmen = ogr;
				break;
			}
		}
		return tempOgretmen;
	}

	public List<Ogretmen> findAll() {
		return DataBase.ogretmenListesi;
	}

}