package se.bastagruppen.webshop.repository;

import java.util.List;

import se.bastagruppen.webshop.interfaces.OrderRepository;
import se.bastagruppen.webshop.model.Order;

public class FileOrderRepository extends FileRepository implements OrderRepository 
{
	

	public FileOrderRepository(String dir, String filename)
	{
		super(dir, filename);
		
	}

	@Override
	public void create(Order item)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order findById(String id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAll()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Order item)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id)
	{
		// TODO Auto-generated method stub
		
	}



}
