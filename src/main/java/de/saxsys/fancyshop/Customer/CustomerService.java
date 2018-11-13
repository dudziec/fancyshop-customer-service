package de.saxsys.fancyshop.Customer;

import java.util.concurrent.ThreadLocalRandom;

import org.json.JSONObject;

import lombok.Getter;

@Getter
public class CustomerService {

	private String[] names = new String[] {"Green", "James", "Smith", "Jones", "Black", "Illard", "Irving", "White"};
	private String[] firstNames = new String[] {"John", "Tom", "Jerry", "Walter", "Damian", "George", "Adrian", "Warner"};

	public JSONObject getRandomCustomer() 
	{
		Customer customer = Customer.builder().name(getRandomFromTable(names))
				                              .firstName(getRandomFromTable(firstNames)).build();

		return customer.toJSON();
	}
	
	private String getRandomFromTable(String[] table)
	{
		return table[ThreadLocalRandom.current().nextInt(0, table.length)];
	}
	
}
