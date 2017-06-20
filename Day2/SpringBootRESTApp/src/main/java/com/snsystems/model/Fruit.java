/*
 * Fruit.java - A POJO class acting as a model and annotated with JAXB annotations to provide output in XML format
 * 
 */

package com.snsystems.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fruit")
public class Fruit {

	String name;
	int quantity;

	public Fruit() {
	}

	public Fruit(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

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
