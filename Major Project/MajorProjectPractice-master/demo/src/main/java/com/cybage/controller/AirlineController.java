package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Airline;
import com.cybage.model.Flight;
import com.cybage.service.AirlineService;

@CrossOrigin("*")
@RestController
@RequestMapping("/airline")
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	
	@PostMapping("/addairline")
	public ResponseEntity<Airline> save(@RequestBody Airline airline) {
		airline = airlineService.addAirline(airline);
		return ResponseEntity.ok(airline);
		
	}
	
	@GetMapping("/allAirlines")
	public ResponseEntity<List<Airline>> findAll() {
		List<Airline> list = airlineService.getAllAirlines();
		return ResponseEntity.ok(list);
		
	}	
}
