package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import se.bastagruppen.webshop.interfaces.OrderRepository;
import se.bastagruppen.webshop.interfaces.ProductRepository;
import se.bastagruppen.webshop.interfaces.UserRepository;
import se.bastagruppen.webshop.model.Product;
import se.bastagruppen.webshop.model.User;

public class ECommerceService
{
	Map<Product, Integer> shoppingCart;
	private final UserRepository userRepo;
	private final ProductRepository productRepo;
	private final OrderRepository orderRepo;
	
	public ECommerceService(UserRepository userRepo, OrderRepository orderRepo, ProductRepository productRep) {	
		this.userRepo = userRepo;
		this.orderRepo = orderRepo;
		this.productRepo = productRepo;	
		this.shoppingCart = new HashMap<Product, Integer>();
	}
	
	public void addUser(User user) {
		
		//TODO VALIDATION
		userRepo.create(user);
	}
	
	public User findUserById(String id) {
		return userRepo.findById(id);
	}
	
	public User findUserByName(String name) {
		// TODO
	}
	
	public List<Product> findAllProducts() {
		return productRepo.getAll();
	}
	
	public Product findProductById(String id)
	{
		//TODO VALIDATION
		return productRepo.findById(id);
	}
	
	public void addToCart(Product product, Integer amount)
	{
		shoppingCart.put(product, amount);
	}
	


	addToCart(Product, amount)
	placeOrder(Order order)
	
	
	
	
	

}
