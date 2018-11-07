package de.saxsys.fancyshop.Customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@RequestMapping(value = "/random", produces = "application/json", method = RequestMethod.GET)
	public String getRandomCustomer() {
		CustomerService service = new CustomerService();
		
		return service.getRandomCustomer().toString();
	}
	
}
