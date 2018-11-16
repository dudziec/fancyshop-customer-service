package de.saxsys.fancyshop.Customer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class CustomerService {

	private String[] names = new String[] { "Green", "James", "Smith", "Jones", "Black", "Illard", "Irving", "White" };
	private String[] firstNames = new String[] { "John", "Tom", "Jerry", "Walter", "Damian", "George", "Adrian",
			"Warner" };

	@Autowired
	public CustomerRepository repository;

	public JSONObject getRandomCustomer() {
		Customer customer = Customer.builder().name(getRandomFromTable(names)).firstName(getRandomFromTable(firstNames))
				.build();
		System.out.println(customer.toString());
		return customer.toJSON();
	}

	private String getRandomFromTable(String[] table) {
		return table[ThreadLocalRandom.current().nextInt(0, table.length)];
	}

	public Customer getCustomerById(Long id) {
		return repository.findById(id).get();
	}

	public void addCustomer(Customer customer) {
//		customer.setPassword(getPasswordEncoder().encode(customer.getPassword()));
		repository.save(customer);
	}

	public void removeCustomerWithId(Long id) {
		repository.deleteById(id);
	}

	public List<Customer> getAll() {
		return (List<Customer>) repository.findAll();
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
