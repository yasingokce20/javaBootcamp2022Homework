package javaBootcampHomework1;

public class sayiBulma {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 2, 5, 7, 9, 6 };
		int aranan = 7;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break; // break ifadesi döngüyü bitirir
			}

		}

		if (varMi) {
			System.out.println(aranan + " dizinin içinde bulundu");
		} else
			System.out.println(aranan + " bulunumadi");

	}

}
