package se.bastagruppen.webshop.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import se.bastagruppen.webshop.model.User;

public abstract class FileRepository
{
	protected final File dir;
	protected final String filename;
	protected final File source;

	
	public FileRepository(String dir, String filename)
	{
		this.dir = new File(dir);
		this.filename =filename;
		this.source = new File(dir, filename);
		
		if(!this.dir.exists())
		{
			this.dir.mkdir();
		}
		
	}
	
	
	protected void writeToDisk(List<? extends Object> list) {
    	
    	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(source)))
    	{
    		out.writeObject(list);
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
	
	protected List<? extends Object> restoreFromDisk()
	{
		if(source.exists())
		{
		
			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(source)))
			{
				List<? extends Object> items = new ArrayList<>();
				items = (List<? extends Object>) in.readObject();
				return items;
			}
			catch(IOException | ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
		}
		return new ArrayList<>();
	}
}

























