package kodlama.ioWebSimulate.business;

import java.util.ArrayList;


import kodlama.ioWebSimulate.core.logging.Logger;
import kodlama.ioWebSimulate.dataAccess.Dao;
import kodlama.ioWebSimulate.entities.Category;


public class CategoryManager {
	Dao dao;
	Logger [] loggers ;
	ArrayList<Category> categories ;
	
	
	public CategoryManager(Dao dao, Logger[] loggers, ArrayList<Category> categories) {
		
		this.dao = dao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void categoryAdd(Category category) throws Exception {
		
		for (Category categoryGecici : categories) {
			if (category.categoryName.equals(categoryGecici.categoryName)) {
				throw new Exception("Kardeş kategori ismi mevcut,aynı isimli iki kategori olamaz, kategori eklenemedi");
			}
		}
		
		dao.addCategory(category);
		for (Logger loggerGecici : loggers) {
			loggerGecici.log(category.categoryName);
		}
		categories.add(category);
	}


	
	
}
