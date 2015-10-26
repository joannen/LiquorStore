package se.bastagruppen.webshop.model;

import java.util.List;

public class Order extends ModelObject
{
	private final String id;
	private final User user;
	private List<OrderRow> orderRows;
	
	public Order(String id, User user, List<OrderRow> orderRows) {
	{
		this.id = id;
		this.user = user;
		this.orderRows = orderRows;
	}


