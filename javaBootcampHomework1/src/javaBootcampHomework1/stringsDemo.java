package javaBootcampHomework1;

public class stringsDemo {

	public static void main(String[] args) {  
		
		String mesaj="Bugün hava çok güzel";

		/*System.out.println("Eleman sayisi : " + mesaj.length() );
		System.out.println("5.eleman : " + mesaj.charAt(7) );
		System.out.println(mesaj.concat(" Yaşasın."));
		System.out.println(mesaj.startsWith("F"));
		System.out.println(mesaj.endsWith("l"));
		
		char [] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a")); */
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(6));     // method overloading
		System.out.println(mesaj.substring(6,10));  // method overloading
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		//System.out.println(mesaj.trim());   // get out spaces in begin and end
		
		
		
		
		
		
		
		
		
				
	}

}
