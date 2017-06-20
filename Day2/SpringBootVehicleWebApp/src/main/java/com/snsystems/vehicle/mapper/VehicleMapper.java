package com.snsystems.vehicle.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.snsystems.vehicle.model.Vehicle;

public class VehicleMapper implements RowMapper<Vehicle> {

	@Override
	public Vehicle mapRow(ResultSet arg0, int arg1) throws SQLException {
		Vehicle vehicle = new Vehicle();
		vehicle.setId(arg0.getLong(1));
		vehicle.setName(arg0.getString(2));
		vehicle.setOdometer(arg0.getInt(3));
		
		return vehicle;
	}

}
