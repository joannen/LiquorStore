package se.bastagruppen.webshop.repository;

import java.util.ArrayList;
import java.util.List;

import se.bastagruppen.webshop.interfaces.ProductRepository;
import se.bastagruppen.webshop.model.Product;
import se.bastagruppen.webshop.model.User;

public class FileProductRepository extends FileRepository implements ProductRepository {
	
	private final List<Product> products;

	public FileProductRepository(String dir, String filename)
	{
		super(dir, filename);
		
		this.products = (List<Product>) restoreFromDisk();
	
	}

	@Override
	public void create(Product item)
	{
		products.add(item);
		writeToDisk(products);
		
	}

	@Override
	public Product findById(String id)
	{
		for(Product product : products) {
    		if (product.getId().equals(id)) {
    			return product;
    		}
    	}
        return null;
	}

	@Override
	public List<Product> getAll()
	{
		return new ArrayList<>(products);
	}

	@Override
	public void update(Product item)
	{
		for (int i = 0; i < products.size(); i++)
	    	{
	    		if(item.getId().equals(products.get(i).getId()))
	    			{
	    				products.remove(i);
	    				products.add(item);
	    				writeToDisk(products);
	    			}
	    	}
		
	}

	@Override
	public void delete(String id)
	{
		for (int i = 0; i < products.size(); i++)
	    	{
	    		if(id.equals(products.get(i).getId()))
	    			{
	    				products.remove(i);
	    				writeToDisk(products);
	    			}
	    	}
	
	}
		
}
	