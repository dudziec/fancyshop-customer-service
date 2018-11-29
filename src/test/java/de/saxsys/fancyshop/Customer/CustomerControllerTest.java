package de.saxsys.fancyshop.Customer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.saxsys.fancyshop.customer.controller.CustomerController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerControllerTest {
	
	@Autowired
	private CustomerController controller;
	
	@Before
	public void setUp()
	{
	}
	
	@Test
	public void shouldReturnRandomCustomer() {
		assertNotNull(controller.getRandom());
	}
}
