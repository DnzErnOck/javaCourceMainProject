package kodlamaio.dataAccess;

import kodlamaio.entities.Educators;

public class HibernateEducatorDao implements EducatorDao{

	@Override
	public void add(Educators educators) {
		System.out.println("Hibernate ile eklendi : " + educators.getName());
		
	}

}
