package kodlamaio.dataAccess;

import kodlamaio.entities.Categories;

public class JdbsCategoryDao implements CategoryDao{

	@Override
	public void add(Categories categories,Categories[] categoriesList) {
		System.out.println("Jdbc ile veritabanına eklendi.");
		
	}

}
