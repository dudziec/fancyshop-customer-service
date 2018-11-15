package de.saxsys.fancyshop.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/random", produces = "application/json", method = RequestMethod.GET)
	public String getRandomCustomer() {
		
		return service.getRandomCustomer().toString();
	}
	
	@GetMapping(value = "/get-customer/{id}")
	public Customer getCustomerById(@PathVariable Long id)
	{
		return service.getCustomerById(id);
	}
	
	@PostMapping(value = "/add-customer")
	public void addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
}
