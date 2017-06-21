package com.snsystems.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.snsystems.model.Customer;

// Jersy

@Named // like a Controller
// @Component
@Path("/")
public class CustomerRest {

	private static List<Customer> customers = new ArrayList<>();
	static {
		Customer customer = new Customer();
		customer.setId(100l);
		customer.setName("Sathya");
		customer.setEmail("sathya@gmail.com");
		customers.add(customer);
		
		customer = new Customer();
		customer.setId(101l);
		customer.setName("Laxmi");
		customer.setEmail("laxmi@gmail.com");
		customers.add(customer);

		customer = new Customer();
		customer.setId(102l);
		customer.setName("Sai");
		customer.setEmail("sai@gmail.com");
		customers.add(customer);
		
	}
	
	
	@GET
	@Path("customers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {
		return customers;
	}
	
	@GET
	@Path("customer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@QueryParam("id") long id) {
		for (Customer customer : customers) {
			if (customer.getId() != null && id == customer.getId()) {
				return customer;
			}
		}
		return null;
	}
}
