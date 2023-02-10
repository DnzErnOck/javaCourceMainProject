package kodlamaio.dataAccess;

import kodlamaio.entities.Courses;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Courses courses, Courses[] courseList) {
		System.out.println("Hibernate ile eklendi : " + courses.getName());
		
	}

}
