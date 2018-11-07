package de.saxsys.fancyshop.Customer;

import org.json.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
public class Customer {
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
}
