package de.saxsys.fancyshop.customer.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.saxsys.fancyshop.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findByName(String name);
	Optional<Customer> findById(Long id);
}
