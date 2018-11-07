package de.saxsys.fancyshop.Customer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerControllerTest {
	private CustomerController controller;
	
	@Before
	public void setUp()
	{
		controller = new CustomerController(); 
	}
	
	@Test
	public void shouldReturnRandomCustomer() {
		assertNotNull(controller.getRandomCustomer());
	}

}
