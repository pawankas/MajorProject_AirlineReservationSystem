package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	private int bookingId;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	private double fare;
//	@PrimaryKeyJoinColumn
//	private Flight flight;
//	@PrimaryKeyJoinColumn
//	private Passenger passenger;
//	@PrimaryKeyJoinColumn
//	private Promocode promocode;
	
	
}
