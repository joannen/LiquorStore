package se.bastagruppen.webshop.repository;

import se.bastagruppen.webshop.interfaces.UserRepository;
import se.bastagruppen.webshop.model.User;

import java.util.List;

/**
 * Created by fredrik on 26/10/15.
 */
public class FileUserRepository implements UserRepository {

    @Override
    public void create(User item) {

    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User item) {

    }

    @Override
    public void delete(User item) {

    }
}
