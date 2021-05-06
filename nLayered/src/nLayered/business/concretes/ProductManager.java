package nLayered.business.concretes;

import java.util.List;

import nLayered.business.abstracts.ProductService;
import nLayered.core.LoggerService;
import nLayered.dataAccess.abstracts.ProductDao;
import nLayered.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
	//is kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride urun kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Urun eklendi" +product.getName());
		
	}

	@Override
	public List<Product> getAll() {
	
		return null;
	}

}
