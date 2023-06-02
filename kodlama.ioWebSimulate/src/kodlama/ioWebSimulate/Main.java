package kodlama.ioWebSimulate;

import java.util.ArrayList;
import java.util.Iterator;


import kodlama.ioWebSimulate.business.*;
import kodlama.ioWebSimulate.business.InstructorManager;
import kodlama.ioWebSimulate.core.logging.Databaselogger;
import kodlama.ioWebSimulate.core.logging.FileLogger;
import kodlama.ioWebSimulate.core.logging.Logger;
import kodlama.ioWebSimulate.dataAccess.HibernateDao;
import kodlama.ioWebSimulate.dataAccess.JdbcDao;
import kodlama.ioWebSimulate.entities.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// 
		Instructor instructor1 = new Instructor("Engin" , "Demiroğ");
		Instructor instructor2 = new Instructor("Yasin" , "Gökçe");
		Instructor instructor3 = new Instructor("Furkan" , "Kara");
		//instructor1.setInstructorName("Engin Demiroğ");
		Instructor instructor4 = new Instructor("Engin" , "Demiroğ");
		
		ArrayList<Instructor> instructors = new ArrayList<Instructor>();
		ArrayList<Course> courses = new ArrayList<Course>();                // Kursları tutmak için arraylist
		ArrayList<Category> categories = new ArrayList<Category>();
	/*	instructors.add(instructor1);          // ne dedik bu işlem burada olmaz bu iş katmanın işi , ekleme çıkarma loglama işlemleri iş katmanında yapılır
		instructors.add(instructor2);
		instructors.add(instructor3);
		//System.out.println(instructors);         bu kodun çıktısını sorgula ilginç , sanırım nesnenin adreslemeleriyle ilgili bir çıktı , ne demek ?
		instructors.add(instructor4);
	*/	
		Course course1 = new Course("Java Eğitimi", 0 );
		
 //		course1.courseName="Java Eğitimi";
 //		course1.coursePrice=0;
	//  Course course2 = new Course("Java Eğitimi", 0);

		Category category1 = new Category("Yazılım");
		//Category category2 = new Category("Yazılım");
		// arayüz iş birimiyle (katmanıyla) iletişim kurar
		// başlıyoruz 
		
		
		
		
		Logger[] loggers = {new Databaselogger() , new FileLogger()};       // instructor managerin ihtiyacı olduğu için
		
		
	
		
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers, instructors);
		instructorManager.instructorAdd(instructor1);
		instructorManager.instructorAdd(instructor2);
		System.out.println();
		 
	 
		
		CourseManager courseManager = new CourseManager(new JdbcDao(),new FileLogger(), courses);            // sadece filelogger yapılacağı için loggers göndermedik . 
		courseManager.courseAdd(course1);															// courseManager da kodu da ona göre yazdık
		System.out.println();
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers, categories);
		categoryManager.categoryAdd(category1);
		// categoryManager.categoryAdd(category2);
		
		
	
		
	
		
		
		System.out.println();
		

		
	/*	for (Instructor instructorGecici : instructors) {
			 if (instructor1.instructorName.equals(instructorGecici.instructorName)) {          // ilk kısma ne yazacağız 
				System.out.println(" bu eğitmen zaten var ");							 // burası kontrol paneli , listemizdeki eğitmenlerle kontrol ettiğimiz 
			 }																		 //	(yeni ekleyeceğiz eğitmen )  var mı?                  
		}
	*/	
		/*for (Category category1 : categories) {
        if (category.getName().equals(category1.getName())) {                   // başkasının örneği
            throw new Exception("Kategori ismi mevcuttur, tekrar edemez.");
        }*/
		
		
		
//		System.out.println(instructors.get(0).instructorName);              // listdeki elemanları listelemenin manuel yönü
//		System.out.println(instructors.get(0).instructorLastName);
//		//System.out.println();
//		System.out.println();
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Sistemimizdeki Güncel Eğitmenlerimiz ");
		System.out.println("--------------------------------------- ");
		
		for (Instructor instructorGecici : instructors) {
			System.out.println(instructorGecici.instructorName +" "+ instructorGecici.instructorLastName);
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Sistemimizdeki Güncel Kurslarımız ");
		System.out.println("--------------------------------------- ");

		for (Course courseGecici : courses) {
			System.out.println(courseGecici.courseName + " , fiyatı : " + courseGecici.coursePrice);
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Sistemimizdeki Güncel Kategorilerimiz ");
		System.out.println("--------------------------------------- ");
		
		for (Category categoryGecici : categories) {
			System.out.println(categoryGecici.categoryName);
			
		}
		
		
	}

}
