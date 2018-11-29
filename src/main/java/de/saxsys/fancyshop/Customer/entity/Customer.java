package de.saxsys.fancyshop.customer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String name;
	
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();

		if (firstName != null) {
			object.put("firstName", firstName);
		}

		if (name != null) {
			object.put("name", name);
		}
		return object;
	}

	public Customer(String firstName, String name) {
		super();
		this.firstName = firstName;
		this.name = name;
	}
}
