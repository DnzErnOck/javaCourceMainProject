package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Courses;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Courses[] courseList;

	public CourseManager(CourseDao courseDao,Logger[] loggers,Courses[] courseList) {
		this.courseDao = courseDao;
		this.loggers=loggers;
		this.courseList=courseList;
	}
	
	public void add(Courses courses,Courses[] courseList) throws Exception {
		for (Courses courses2 : courseList) {
			if (courses2.getName().equals(courses.getName())) {
				throw new Exception(courses.getName() + " isimli kurs daha önce eklenmiştir.");
			}
			else if (courses.getPrice() <= 0)
			{
				throw new Exception(courses.getName() + " kursunun fiyatı 0' dan küçük olamaz.");
			}
			else {
				courseDao.add(courses,courseList);
			}
		}
		
		
		for (Logger logger : loggers) {
			logger.log(courses.getName());
		}
	}
	
}
