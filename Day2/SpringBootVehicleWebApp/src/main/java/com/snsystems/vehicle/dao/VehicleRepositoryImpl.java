package com.snsystems.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.snsystems.vehicle.mapper.VehicleMapper;
import com.snsystems.vehicle.model.Vehicle;

@Repository
public class VehicleRepositoryImpl implements IVehicleRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Vehicle> findAllVehicles() {
		
		String selectQuery = "select * from vehicle";
		List<Vehicle> vehicles = jdbcTemplate.query(selectQuery, new VehicleMapper());
		
		return vehicles;
	}
	
	@Override
	public List<String> findAllVehicleNames() {
		
		String selectQuery = "select name from vehicle";
		List<String> vehicles = jdbcTemplate.queryForList(selectQuery, String.class);
		
		return vehicles;
	}

	@Override
	public void save(Vehicle vehicle) {
		
		//int count = jdbcTemplate.update("insert into vehicle(name) values('?" + vehicle.getName()+ "')");
		
		String insertQuery = "insert into vehicle(name) values(?)";
		int count = jdbcTemplate.update(insertQuery, vehicle.getName());
		System.out.println(count + " record inserted");
	}

	
}
