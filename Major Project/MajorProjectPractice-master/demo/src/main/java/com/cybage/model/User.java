package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String emailId;
	@Column
	private double contactNo;
	@Column
	private String gender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String firstname, String lastname, String emailId, double contactNo, String gender) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getContactNo() {
		return contactNo;
	}

	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", contactNo=" + contactNo + ", gender=" + gender + "]";
	}

}
