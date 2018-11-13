package de.saxsys.fancyshop.Customer;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerApplication extends SpringBootServletInitializer {	
	
	public static void main(String[] args) {
 		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CustomerApplication.class);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository)
	{
		return (args) -> {
			repository.save(new Customer("Tom", "Hanks"));
			repository.save(new Customer("Its me", "Johhny"));
			
			System.out.println("Found with findAll()");
			
			for(Customer customer : repository.findAll())
			{
				System.out.println(customer.toString());
			}
				
			System.out.println("Customer found with name Hanks");
			repository.findByName("Hanks").forEach(hanks -> {
				System.out.println(hanks.toString());
			});
			
			System.out.println(repository.findById(1L).get().toString());

		};
	}
}
