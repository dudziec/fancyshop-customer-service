package de.saxsys.fancyshop.Customer;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import de.saxsys.fancyshop.customer.services.CustomerService;

public class CustomerServiceTest {
	private CustomerService service;
	
	@Before
	public void setUp() 
	{
		service = new CustomerService();
	}
	
	@Test
	public void shouldGetRandomCustomer() {
		JSONObject randomCustomer = service.getRandomCustomer();
		
		String name = randomCustomer.getString("name");
		String firstName = randomCustomer.getString("firstName");
		
		assertTrue(Arrays.asList(service.getNames()).stream().anyMatch(n -> n.equals(name)));
		assertTrue(Arrays.asList(service.getFirstNames()).stream().anyMatch(fn -> fn.equals(firstName)));
	}

}
