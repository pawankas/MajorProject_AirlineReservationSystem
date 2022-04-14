package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.FlightDao;
import com.cybage.model.Flight;

@Service
public class FlightService {
	@Autowired
	private FlightDao flightDao;
	
	public Flight addFlight(Flight flight) {
		return flightDao.save(flight);
	}
	
	public List<Flight> getAllFlights(){
		List<Flight> flights = new ArrayList<Flight>();  
		flightDao.findAll().forEach(flight1 -> flights.add(flight1));  
		return flights;  
		}
	
	public void updateFlight(Flight flight, int flightId)   
	{  
		flightDao.save(flight);  
	}  
	
	public void delete(int flightId)   
	{  
		flightDao.deleteById(flightId);  
	} 
}
