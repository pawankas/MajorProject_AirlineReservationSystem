package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "flight")
public class Flight {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	@Column
	private String operatorName;
	@Column
	private String departureCity;
	@Column
	private String arivalCity;
	@Column
	private double price;
	@Column
	private int seatingCapacity;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArivalCity() {
		return arivalCity;
	}

	public void setArivalCity(String arivalCity) {
		this.arivalCity = arivalCity;
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

	public Flight(int flightId, String operatorName, String departureCity, String arivalCity, double price,
			int seatingCapacity) {
		super();
		this.flightId = flightId;
		this.operatorName = operatorName;
		this.departureCity = departureCity;
		this.arivalCity = arivalCity;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", operatorName=" + operatorName + ", departureCity=" + departureCity
				+ ", arivalCity=" + arivalCity + ", price=" + price + ", seatingCapacity=" + seatingCapacity + "]";
	}
	
	
	
	
}
