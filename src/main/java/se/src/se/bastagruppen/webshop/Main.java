package se.bastagruppen.webshop;

import se.bastagruppen.webshop.interfaces.ProductRepository;
import se.bastagruppen.webshop.interfaces.UserRepository;
import se.bastagruppen.webshop.model.Product;
import se.bastagruppen.webshop.model.User;
import se.bastagruppen.webshop.repository.FileProductRepository;
import se.bastagruppen.webshop.repository.FileUserRepository;

/**
 * Created by fredrik on 26/10/15.
 */
public final class Main {

    public static void main(String[] args) {
    	User user2 = new User("1001", "Josefine", "lolwut123");
    	User user = new User("1001", "Fredrik", "lolwut123");
    	User user3 = new User("2345","Jo", "ju");
    	
        UserRepository userRepo = new FileUserRepository("users", "mupp");
        ProductRepository productRepo = new FileProductRepository("products", "mupp");
        
        
        Product jackDaniels = new Product("01", "Jack Daniels", 19.99);
        
        productRepo.create(jackDaniels);
        //userRepo.update(user2);
        userRepo.create(user3);
        userRepo.delete("1001");
        if(userRepo.getAll().size() != 0)
        {
        	 System.out.println(userRepo.getAll().get(0).getUsername());
        }
        
        if(userRepo.getAll().size() != 0)
        {
        	 System.out.println(productRepo.getAll().get(0).getName());
        }
        
       
    }
}
