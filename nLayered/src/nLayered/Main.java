package nLayered;

import nLayered.business.abstracts.ProductService;
import nLayered.business.concretes.ProductManager;
import nLayered.core.JLoggerManagerAdapter;
import nLayered.dataAccess.concretes.AbcProductDao;
import nLayered.dataAccess.concretes.HibernateProductDao;
import nLayered.entities.concretes.Product;


/**Katmanlar:
Data Access
Business
Api
Yardýmcý katmanlar:
Entity
Core***/

public class Main {

	public static void main(String[] args) {
		
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product=new Product(1,2,"Elma",12,50);
		productService.add(product);
		
		
	}

}
