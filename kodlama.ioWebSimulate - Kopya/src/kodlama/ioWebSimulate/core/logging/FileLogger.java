package kodlama.ioWebSimulate.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı " + data);
		
	}
	
	public void logCourse (String data , int price) {                                                  // kurs loglamasında sadece data vermediğimiz için 
		System.out.println("Dosyaya loglandı " +"Course name: "+ data + ", Price: " + price + " lira");	   // ekstra logCourse diye bir fonsiyon yazdık
	}
	

}
