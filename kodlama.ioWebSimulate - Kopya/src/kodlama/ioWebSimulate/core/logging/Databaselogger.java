package kodlama.ioWebSimulate.core.logging;

public class Databaselogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı " + data );
		
	}

	@Override
	public void logCourse(String data, int price) {
		
		// yönetim şu an course ları database e loglamamızı istemiyor, yarın öbür gün isterse geliriz kodlarını yazarız
	}
	
	

}
