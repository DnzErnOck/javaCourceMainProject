package kodlamaio.dataAccess;

import kodlamaio.entities.Educators;

public class JdbcEducatorDao implements EducatorDao{

	@Override
	public void add(Educators educators) {
		System.out.println("Jdbc ile eklendi : " + educators.getName());
		
	}

}
