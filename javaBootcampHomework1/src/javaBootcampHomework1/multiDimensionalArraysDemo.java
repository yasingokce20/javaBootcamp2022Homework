package javaBootcampHomework1;

public class multiDimensionalArraysDemo {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "bursa";
		sehirler[0][2] = "bilecik";
		sehirler[1][0] = "ankara";
		sehirler[1][1] = "kayseri";
		sehirler[1][2] = "konya";
		sehirler[2][0] = "diyarbakır";
		sehirler[2][1] = "şanlıurfa";
		sehirler[2][2] = "gaziantep";

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("------------------------");
		}
	}

}
