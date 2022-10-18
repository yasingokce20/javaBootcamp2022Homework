package javaBootcampHomework1;

public class mukemmelSayi {

	public static void main(String[] args) {

		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println(number + " mükemmel sayidir");
		}
		if (total != number) {
			System.out.println(number + " mükemmel sayi değildir");
		}
		else
			System.out.println("gecersiz bir sayi girdiniz");
	}

}
