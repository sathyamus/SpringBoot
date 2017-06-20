package com.snsystems.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.snsystems.vehicle.dao.IVehicleRepository;
import com.snsystems.vehicle.model.Vehicle;

@Controller
@RequestMapping("/website/vechicle")
public class VehicleController {

	@Autowired
	private IVehicleRepository vehicleRepository;

	
	@RequestMapping(value = "/listNames.html", method = RequestMethod.GET)
	public ModelAndView vehicleNames() {

		System.out.println("Listing Vehicle Names");
		// Vehicle vehicle = new Vehicle("Honda");
		return new ModelAndView("allVehicles", "vehicles", vehicleRepository.findAllVehicleNames());
	}


	@RequestMapping(value = "/list.html", method = RequestMethod.GET)
	public ModelAndView vehicles() {

		System.out.println("Listing All Vehicle details");
		return new ModelAndView("allVehicles", "vehicles", vehicleRepository.findAllVehicles());
	}

	
	@RequestMapping(value = "/newVehicle.html", method = RequestMethod.GET)
	public ModelAndView renderNewVehicleForm() {
		
		System.out.println("renderNewVehicleForm");
		Vehicle vehicle = new Vehicle("i20");
		return new ModelAndView("newVehicle", "form", vehicle);
	}

	@RequestMapping(value = "/newVehicle.html", method = RequestMethod.POST)
	public String saveVehicle(Vehicle vehicle) {
		System.out.println("New Vehicle Added");
		
		vehicleRepository.save(vehicle);
		
		return "redirect:/website/vechicle/list.html";
	}


}
