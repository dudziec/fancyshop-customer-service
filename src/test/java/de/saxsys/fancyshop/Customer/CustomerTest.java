package de.saxsys.fancyshop.Customer;


import org.json.JSONException;
import org.junit.Test;

public class CustomerTest {

	@Test(expected = JSONException.class)
	public void shouldNotAddName() {
		Customer customer = Customer.builder().name(null).firstName("John").build();
		customer.toJSON().getString("name");
	}

	@Test(expected = JSONException.class)
	public void shouldNotAddFirstName() {
		Customer customer = Customer.builder().name("Green").firstName(null).build();

		customer.toJSON().getString("firstName");
	}

}
