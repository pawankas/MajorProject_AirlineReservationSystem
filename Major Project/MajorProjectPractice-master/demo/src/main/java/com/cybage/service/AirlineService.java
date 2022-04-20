package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AirlineDao;
import com.cybage.model.Airline;
import com.cybage.model.Flight;


@Service
@Transactional
public class AirlineService {
	@Autowired
	private AirlineDao airlineDao;
	
	public Airline addAirline(Airline airline) {
		return airlineDao.save(airline);
	}
	
	public List<Airline> getAllAirlines() {
		List<Airline> airlines = new ArrayList<Airline>();
		airlineDao.findAll().forEach(airline1 -> airlines.add(airline1));
		return airlines;
	}
	
}
