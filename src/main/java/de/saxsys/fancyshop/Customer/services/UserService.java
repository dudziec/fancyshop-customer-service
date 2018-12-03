package de.saxsys.fancyshop.customer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.saxsys.fancyshop.customer.entity.User;
import de.saxsys.fancyshop.customer.repositories.UserRepository;
import lombok.Getter;

@Getter
@Service
public class UserService {
	
	@Autowired
	public UserRepository repository;


	public User getCustomerById(Long id) {
		return repository.findById(id).get();
	}

	public void addUser(User customer) {
		repository.save(customer);
	}

	public void removeCustomerWithId(Long id) {
		repository.deleteById(id);
	}

	public List<User> getAll() {
		return repository.findAll();
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return repository.findByUsername(username);
	}
}
