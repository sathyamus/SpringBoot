/*
 * Coffee.java - Model class containing JAXB annotations that will be used to convert object into 
 * XML output
 * 
 * Remember - JAXB is included with Java 6 onwards, so check the JRE library version in the project
 * if JAXB annotations are not available  
 */
package com.snsystems.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coffee")
public class Coffee {

	String name;
	int quantity;

	// Constructor methods

	public Coffee() {

	}

	public Coffee(String name, int qty) {
		this.name = name;
		this.quantity = qty;
	}

	// Generate getter and setter methods
	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	@XmlElement
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
