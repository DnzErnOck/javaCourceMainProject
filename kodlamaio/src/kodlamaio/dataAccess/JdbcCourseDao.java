package kodlamaio.dataAccess;

import kodlamaio.entities.Courses;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Courses courses , Courses[] courseList) {
		System.out.println("Jdbc ile eklendi : " + courses.getName());
		
	}

}
