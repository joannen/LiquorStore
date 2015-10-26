package se.bastagruppen.webshop.repository;

import se.bastagruppen.webshop.interfaces.UserRepository;
import se.bastagruppen.webshop.model.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fredrik on 26/10/15.
 */
public class FileUserRepository extends FileRepository implements UserRepository {
	

	private final List<User> users;
    
	public FileUserRepository(String dir, String filename)
	{
		super(dir, filename);
	
		this.users = (List<User>) restoreFromDisk();
		
	 
	}
	
	public List<User> getUsers()
	{
		return new ArrayList(users);
	}

	@Override
	public void create(User user) {
		users.add(user);
		writeToDisk(users);
	}
	

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
    	return new ArrayList(users);
	
    }

    @Override
    public void update(User item) {

    }

    @Override
    public void delete(User item) {

    }
}
