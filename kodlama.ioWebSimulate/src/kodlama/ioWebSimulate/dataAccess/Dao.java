package kodlama.ioWebSimulate.dataAccess;

import kodlama.ioWebSimulate.entities.Category;
import kodlama.ioWebSimulate.entities.Course;
import kodlama.ioWebSimulate.entities.Instructor;

public interface Dao {
	void addInstructor(Instructor instructor) ;
	void addCourse(Course course);
	void addCategory(Category category) ;
}
