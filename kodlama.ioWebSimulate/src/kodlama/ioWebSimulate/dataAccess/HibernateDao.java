package kodlama.ioWebSimulate.dataAccess;

import kodlama.ioWebSimulate.entities.Category;
import kodlama.ioWebSimulate.entities.Course;
import kodlama.ioWebSimulate.entities.Instructor;

public class HibernateDao implements Dao {

	public void addInstructor(Instructor instructor) {
		System.out.println( instructor.instructorName + " "+instructor.instructorLastName + " isimli eğitmenimiz hibernate ile veritabanımıza eklenmiştir.");
	}

	public void addCourse(Course course) {
		System.out.println( course.courseName + " isimli "+ course.coursePrice + " fiyatlı kursumuz hibernate ile veritabanımıza eklenmiştir.");
	}

	public void addCategory(Category category) {
		System.out.println( category.categoryName + " isimli kategori hibernate ile veritabanımıza eklenmiştir.");
	}
	
}
