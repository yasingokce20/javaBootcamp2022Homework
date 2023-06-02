package kodlama.ioWebSimulate.business;

import java.util.ArrayList;

import kodlama.ioWebSimulate.core.logging.Logger;
import kodlama.ioWebSimulate.dataAccess.Dao;
import kodlama.ioWebSimulate.dataAccess.HibernateDao;
import kodlama.ioWebSimulate.dataAccess.JdbcDao;
import kodlama.ioWebSimulate.entities.Instructor;


public class InstructorManager {
	Dao dao;
	Logger[] loggers;
	ArrayList<Instructor> instructors ;
	
	public InstructorManager(Dao dao, Logger[] loggers, ArrayList<Instructor> instructors) {
	
		this.dao = dao;
		this.loggers = loggers;
		this.instructors = instructors;
	}


	public InstructorManager(Dao dao , Logger[] loggers ) {          
		this.dao = dao;
		this.loggers = loggers;
	}
	
	
	public void instructorAdd(Instructor instructor) throws Exception {
		// iş kuralları
		//System.out.println(" instructor added = " + instructor.instructorName + " " + instructor.instructorLastName);
		
		for (Instructor instructorGecici : instructors) {
			 if (instructor.instructorName.equals(instructorGecici.instructorName)) {          // ilk kısma ne yazacağız 
				throw new Exception("Bu eğitmen sistemde var");							 // burası kontrol paneli , listemizdeki eğitmenlerle kontrol ettiğimiz 
			 }																		 //	(yeni ekleyeceğiz eğitmen )  var mı?                  
		}
		
		dao.addInstructor(instructor);
		instructors.add(instructor);                                                // gelen instructoru listeye ekleme   
		for (Logger logger : loggers) {                                             // loglama kodumuz sırasıyla loglamaları burada yapıyor
			logger.log(instructor.instructorName +" "+ instructor.instructorLastName);
		}
		
	}
	


}
