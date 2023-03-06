package com.gulsufindik;

// Java anonymous Inner Class sınıf ismi olmayan ve sadece 1 nesnesi olan sınıf türleridir

// ne zman faydalıdır?
// bir sınıfın bir metodunu override edip tek bir nesne oluşturmak istediğiniz zaman kullanılabilir.

public class Main {

	public static void main(String[] args) {

		// Anonymous Inner Class:

		Insan vejeteryanInsan = new Insan() {
			public void yemekYe() {
				System.out.println("sadece sebze ve meyve yiyor");
			}

		};

		vejeteryanInsan.yemekYe();
		vejeteryanInsan.suIc();

		Insan insan = new Insan();
		insan.yemekYe();

	}

}
