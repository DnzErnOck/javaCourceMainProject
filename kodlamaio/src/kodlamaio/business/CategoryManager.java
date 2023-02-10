package kodlamaio.business;

import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.dataAccess.HibernateCategoryDao;
import kodlamaio.entities.Categories;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Categories[] categoriesList;
	
	//CategoryManager new lendiğinde bana bir categoryDao ver
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers,Categories[] categoriesList) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
		this.categoriesList=categoriesList;
	}
	
	public void add(Categories categories,Categories[] categoriesList) throws Exception {
		for (Categories categories2 : categoriesList) {
			if (categories2.getName().equals(categories.getName())) {
				throw new Exception(categories.getName() + " isimli kategori daha önce eklenmiştir. Tekrar eklenemez.");
			}
		}
		
		categoryDao.add(categories,categoriesList);
		
		for (Logger logger : loggers) {
			logger.log(categories.getName());
		}
	}
}
