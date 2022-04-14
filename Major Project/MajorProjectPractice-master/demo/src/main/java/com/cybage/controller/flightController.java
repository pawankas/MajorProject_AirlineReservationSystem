package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Flight;
import com.cybage.service.FlightService;

@RestController
@CrossOrigin("*")
@RequestMapping("/flight")
public class flightController {

	@Autowired
	FlightService flightService;

	@PostMapping("/add")
	private Flight addFlight(@RequestBody Flight flight) {
		flight = flightService.addFlight(flight);
		return flight;
	}

	@GetMapping("/all")
	private List<Flight> getAllfFlights() {
		return flightService.getAllFlights();
	}

	@PutMapping("/update")
	private Flight update(@RequestBody Flight flight) {
		flightService.addFlight(flight);
		return flight;
	}

	@DeleteMapping("/deleteflight/{flightId}")
	private void deleteBook(@PathVariable("flightId") int flightId, Flight flight) {
		flightService.delete(flightId);
		System.out.println("Flight Deleted Successfully!");
	}
}
