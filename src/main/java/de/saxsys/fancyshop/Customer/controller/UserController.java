package de.saxsys.fancyshop.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.saxsys.fancyshop.customer.entity.User;
import de.saxsys.fancyshop.customer.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/get/{id}")
	public User getById(@PathVariable Long id)
	{
		return service.getCustomerById(id);
	}
	
	@GetMapping("/get-user/{username}")
	public User getByUsername(@PathVariable String username) 
	{
		return service.getByUsername(username);
	}
	
	@GetMapping(value = "/get-all")
	public List<User> getAll() {
		return service.getAll();
	}
	
	
	@PostMapping(value = "/add")
	public void add(@RequestBody User user) {
		service.addUser(user);
	}
	
	@PostMapping(value = "/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
