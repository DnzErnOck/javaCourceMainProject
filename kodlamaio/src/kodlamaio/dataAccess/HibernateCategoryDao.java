package kodlamaio.dataAccess;

import kodlamaio.entities.Categories;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Categories categories,Categories[] categoriesList) {
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}

}
