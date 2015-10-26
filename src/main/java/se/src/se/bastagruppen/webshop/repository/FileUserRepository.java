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
    
	@SuppressWarnings("unchecked")
	public FileUserRepository(String dir, String filename)
	{
		super(dir,filename);
	
		this.users = (List<User>) restoreFromDisk();
		
	 
	}

	@Override
	public void create(User user) {
		users.add(user);
		writeToDisk(users);
	}
	

    @Override
    public User findById(String id) {
    	for(User user: users)
    	{
    		if(user.getId().equals(id))
    		{
    			return user;
    		}
    	}
        return null;
    }

    @Override
    public List<User> getAll() {
    	return new ArrayList<>(users);
	
    }

    @Override
    public void update(User item) {
    	
    	for (int i = 0; i < users.size(); i++)
    	{
    		if(item.getId().equals(users.get(i).getId()))
    			{
    				users.remove(i);
    				users.add(item);
    				writeToDisk(users);
    			}
    	}

    }

    @Override
    public void delete(String id) {
    	for (int i = 0; i < users.size(); i++)
    	{
    		if(id.equals(users.get(i).getId()))
    			{
    				users.remove(i);
    				writeToDisk(users);
    			}
    	}

    }
}
