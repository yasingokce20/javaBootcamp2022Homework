package javaBootcampHomework1;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {

		case 'A':
			System.out.println("mükemmel : geçtiniz");
			break;
		case 'B':
			System.out.println("çok güzel : geçtiniz");
			break;
		case 'F':
			System.out.println("maalesef kaldınız ");
			break;
		default:
			System.out.println("geçersiz not girdiniz");
		}

	}

}
