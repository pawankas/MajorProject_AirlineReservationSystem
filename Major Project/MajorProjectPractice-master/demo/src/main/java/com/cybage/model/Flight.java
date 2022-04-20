package com.cybage.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "flight")
public class Flight {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	@Column
	private String flightName;
	
	@Column
	private Date departureDate;
	@Column
	private String departureTime;
	@Column
	private Date arivalDate;
	@Column
	private String arivalTime;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	private String classType;
	@Column
	private int noOfStops;
	@Column
	private double price;
	@Column
	private int seatingCapacity;

	
	@ManyToOne(fetch = FetchType.LAZY,  optional = false)
	@JoinColumn(name="airlineId")
	private Airline airline;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightId, String flightName, Date departureDate, String departureTime, Date arivalDate,
			String arivalTime, String source, String destination, String classType, int noOfStops, double price,
			int seatingCapacity, Airline airline) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arivalDate = arivalDate;
		this.arivalTime = arivalTime;
		this.source = source;
		this.destination = destination;
		this.classType = classType;
		this.noOfStops = noOfStops;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.airline = airline;
	}



	public int getFlightId() {
		return flightId;
	}



	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}



	public String getFlightName() {
		return flightName;
	}



	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}



	public Date getDepartureDate() {
		return departureDate;
	}



	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}



	public String getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}



	public Date getArivalDate() {
		return arivalDate;
	}



	public void setArivalDate(Date arivalDate) {
		this.arivalDate = arivalDate;
	}



	public String getArivalTime() {
		return arivalTime;
	}



	public void setArivalTime(String arivalTime) {
		this.arivalTime = arivalTime;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public String getClassType() {
		return classType;
	}



	public void setClassType(String classType) {
		this.classType = classType;
	}



	public int getNoOfStops() {
		return noOfStops;
	}



	public void setNoOfStops(int noOfStops) {
		this.noOfStops = noOfStops;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getSeatingCapacity() {
		return seatingCapacity;
	}



	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}



	public Airline getAirline() {
		return airline;
	}



	public void setAirline(Airline airline) {
		this.airline = airline;
	}



	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", arivalDate=" + arivalDate + ", arivalTime=" + arivalTime
				+ ", source=" + source + ", destination=" + destination + ", classType=" + classType + ", noOfStops="
				+ noOfStops + ", price=" + price + ", seatingCapacity=" + seatingCapacity + ", airline=" + airline
				+ "]";
	}


	
	
	
	
}
