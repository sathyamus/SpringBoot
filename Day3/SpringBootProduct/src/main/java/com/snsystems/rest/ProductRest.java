package com.snsystems.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.snsystems.model.Product;

// Jersy

@Named // like a Controller
@Path("/")
public class ProductRest {

	private static List<Product> products = new ArrayList<>();
	static {
		Product product = new Product();
		product.setId(100l);
		product.setSku("Product 1");
		product.setDescription("Description 1");
		products.add(product);
		
		product = new Product();
		product.setId(101l);
		product.setSku("Product 2");
		product.setDescription("Description 2");
		products.add(product);

		product = new Product();
		product.setId(102l);
		product.setSku("Product 3");
		product.setDescription("Description 3");
		products.add(product);
		
	}
	
	
	@GET
	@Path("products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts() {
		return products;
	}
	
	@GET
	@Path("product")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@QueryParam("id") long id) {
		for (Product product : products) {
			if (id == product.getId()) {
				return product;
			}
		}
		return null;
	}
}
