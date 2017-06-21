package com.snsystems.vehicle.model;

public class Vehicle {

	private Long id;
	private String name;
	private int odometer;
	private String status;
	private String currentDriver;

	public Vehicle() {
		
	}
	
	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public Vehicle(Long id, String name, int odometer, String status, String currentDriver) {
		super();
		this.id = id;
		this.name = name;
		this.odometer = odometer;
		this.status = status;
		this.currentDriver = currentDriver;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrentDriver() {
		return currentDriver;
	}

	public void setCurrentDriver(String currentDriver) {
		this.currentDriver = currentDriver;
	}

	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
