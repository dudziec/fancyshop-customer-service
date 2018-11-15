package de.saxsys.fancyshop.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByName(String name);
	Optional<Customer> findById(Long id);
}
