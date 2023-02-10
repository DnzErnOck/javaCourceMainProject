package kodlamaio;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.EducatorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.HibernateCategoryDao;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.JdbcEducatorDao;
import kodlamaio.dataAccess.JdbsCategoryDao;
import kodlamaio.entities.Categories;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Educators;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Categories categories =new Categories();
		categories.setId(1);
		categories.setName("Robotik");
		
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		  
		Categories[] categoriesList= {new Categories(2,"kodlama"),new Categories(3,"elektronik"),new Categories(4,"Programlama")};
 		 
		CategoryManager categoryManager= new CategoryManager(new JdbsCategoryDao(),loggers,categoriesList);
		categoryManager.add(categories,categoriesList);
		
		
		
		Courses courses =new Courses();
		courses.setId(1);
		courses.setName("Java Programlama");
		courses.setCompletionRate(50);
		courses.setPrice(0);
		
		Courses[] courseList= {new Courses(2,"C#",60,2500),new Courses(3,"Android",80,3600)};
		
		CourseManager courseManager =new CourseManager(new HibernateCourseDao(),loggers,courseList);
		courseManager.add(courses,courseList);
		

		Educators educators = new Educators();
		educators.setId(1);
		educators.setName("Engin");
		educators.setSurname("Demirog");
		educators.setScore(5);
		
		EducatorManager educatorManager=new EducatorManager(new JdbcEducatorDao(),loggers);
		educatorManager.add(educators);

	}

}
