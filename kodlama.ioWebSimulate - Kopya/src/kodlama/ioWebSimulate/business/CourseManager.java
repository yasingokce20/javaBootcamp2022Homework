package kodlama.ioWebSimulate.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioWebSimulate.core.logging.FileLogger;
import kodlama.ioWebSimulate.core.logging.Logger;
import kodlama.ioWebSimulate.dataAccess.Dao;
import kodlama.ioWebSimulate.entities.Course;

public class CourseManager {
	Dao dao;
	// yönetim diyorki kursları sadece dosyaya loglayın 
	//Logger[] loggers ;
	FileLogger filelogger;
	List<Course> courses ;
	/*
	public CourseManager(Dao dao, FileLogger filelogger, List<Course> courses) {
		super();
		this.dao = dao;
		this.filelogger = filelogger;
		this.courses = courses;
	}
	
	*/

	
	  public CourseManager(Dao dao, FileLogger filelogger , ArrayList<Course>courses ) {

		this.dao = dao;
		this.filelogger = filelogger;
		this.courses = courses;
	}
   



	public void courseAdd(Course course) throws Exception {
		// course ekleme islemleri
		if (course.coursePrice < 0) {                                    // şu an bu burada kötü kod imiş , 
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz.");
		}
		// şimdi sırada course daha önce eklenmiş mi onu kontrol edicez
		// Tahminimce normalde burada kursları veritabanına eklediğimiz için veritabanını kontrol etmeliyiz ,
		// ama şimdi bizim veritabanımız olmadığı için Liste oluşturup listeye ekleyeceğiz kursları kontrol edicez
		for (Course courseGecici : courses) {
            if (course.courseName.equals(courseGecici.courseName)) {
                throw new Exception("Kurs ismi mevcuttur, tekrar edemez.");
            }
		}
		
		dao.addCourse(course);
		filelogger.logCourse(course.courseName, course.coursePrice);                //  sadece dosya loglaması
		courses.add(course);
		
	/*	for (Logger logger : loggers) {                                             ////tüm loglamaları yapsak bu şekilde teker teker tüm loglamarı gezdiriridik.
			logger.logCourse(course.courseName, course.coursePrice);
		}
	*/	
	}
	
}
