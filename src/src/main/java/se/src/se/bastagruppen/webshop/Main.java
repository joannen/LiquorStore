package se.bastagruppen.webshop;

import se.bastagruppen.webshop.interfaces.UserRepository;
import se.bastagruppen.webshop.model.User;
import se.bastagruppen.webshop.repository.FileUserRepository;

/**
 * Created by fredrik on 26/10/15.
 */
public final class Main {

    public static void main(String[] args) {
//        User user = new User("1001", "Frrik", "lolwut123");
        UserRepository userRepo = new FileUserRepository("users", "mupp");
//        userRepo.create(user);
        System.out.println(userRepo.getAll().get(0).getUsername());
    }
}
