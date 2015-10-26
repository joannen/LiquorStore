package se.bastagruppen.webshop.model;

public class OrderRow
{
	private final String id;
	private final Product product;
	private final int amount;

	public OrderRow(String id, Product product, int amount)
	{
		this.id = id;
		this.product = product;
		this.amount = amount;
	}

	public String getId()
	{
		return id;
	}

	public Product getProduct()
	{
		return product;
	}

	public int getAmount()
	{
		return amount;
	}
}
