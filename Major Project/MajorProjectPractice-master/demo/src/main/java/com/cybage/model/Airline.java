package com.cybage.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airline")
public class Airline {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airlineId;
	@Column
	private String airlineName;
	@Column
	private String airLineNumber;
	
	@OneToMany(mappedBy = "airline", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

	List<Flight> flightList = new ArrayList<>();
	
	public Airline() {
		this.flightList =new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public Airline(int airlineId, String airlineName, String airLineNumber, List<Flight> flightList) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.airLineNumber = airLineNumber;
		this.flightList = new ArrayList<Flight>();
	}


	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirLineNumber() {
		return airLineNumber;
	}

	public void setAirLineNumber(String airLineNumber) {
		this.airLineNumber = airLineNumber;
	}

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
		  for(Flight f : flightList) {
	            f.setAirline(this);
	        }
	}

	@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", airlineName=" + airlineName + ", airLineNumber=" + airLineNumber
				+ ", flightList=" + flightList + "]";
	}

	
}
