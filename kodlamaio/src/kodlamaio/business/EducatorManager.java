package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.EducatorDao;
import kodlamaio.entities.Educators;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;

	public EducatorManager(EducatorDao educatorDao,Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers=loggers;
	}
	
	public void add(Educators educators) {
		educatorDao.add(educators);
		
		for (Logger logger : loggers) {
			logger.log(educators.getName());
		}
	}
	
}
