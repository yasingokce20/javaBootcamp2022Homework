package javaBootcampHomework1;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		
		int number = 1;
		//int remainder = number % 2 ;
		//System.out.println(remainder);
		
		int kacBöleniVar = 0;
		
		for (int j = 1; j <= number; j++) {
			if (number % j == 0) {
				kacBöleniVar +=  1;
			}
			
		}
		
		System.out.println("number "+ kacBöleniVar + " tane tamsayı bölenine sahip");
		
		if (kacBöleniVar==2) {
			System.out.println("number is prime");
		}else
			System.out.println("number is not prime");
		

		
	}

}
