package javaBootcampHomework1;

public class loopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");
		int a = 1;
		;
		while (a <= 10) {

			System.out.println(a);

			a++;

		}
		System.out.println("while döngüsü bitti");

		int j = 10 ;
		do {

			System.out.println(j);

			j--;

		} while (j>0);
		
		System.out.println("do - while döngüsü de bitti");
	}

}
