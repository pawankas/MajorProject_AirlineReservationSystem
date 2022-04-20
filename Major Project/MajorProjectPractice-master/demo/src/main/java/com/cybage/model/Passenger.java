package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passengers")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String emailId;
	@Column
	private String passengerCategory;
	@Column
	private String gender;
	@Column
	private String contactNo;
	@ManyToOne(fetch = FetchType.LAZY,  optional = false)
	@JoinColumn(name="flightId")
	private Flight flight;
//	@OneToOne(mappedBy = "passenger")
//	private Booking booking;
	
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public Passenger(int passengerId, String firstName, String lastName, String emailId, String passengerCategory,
			String gender, String contactNo) {
		super();
		this.passengerId = passengerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.passengerCategory = passengerCategory;
		this.gender = gender;
		this.contactNo = contactNo;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassengerCategory() {
		return passengerCategory;
	}

	public void setPassengerCategory(String passengerCategory) {
		this.passengerCategory = passengerCategory;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", passengerCategory=" + passengerCategory + ", gender=" + gender
				+ ", contactNo=" + contactNo + "]";
	}
	
	
	
}
