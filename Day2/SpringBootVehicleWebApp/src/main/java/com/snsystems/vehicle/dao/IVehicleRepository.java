package com.snsystems.vehicle.dao;

import java.util.List;

import com.snsystems.vehicle.model.Vehicle;

public interface IVehicleRepository {

	List<Vehicle> findAllVehicles();
	
	List<String> findAllVehicleNames();

	void save(Vehicle vehicle);
}
