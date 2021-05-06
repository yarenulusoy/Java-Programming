package nLayered.dataAccess.abstracts;
import java.util.List;

import nLayered.entities.concretes.Product;

public interface ProductDao {
	//operasyonlar
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
	

}
