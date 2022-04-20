package com.cybage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaint {
	
	@Id
	private int complaintId;
	@Column
	private String adminComplaintReply;
	@Column
	private String complaintDescription;
	@Column
	private boolean compliantStatus;
	@Column
	private Date registeredDate;
	@Column
	private Date resolvedDate;
	
	public Complaint() {
		// TODO Auto-generated constructor stub
	}

	public Complaint(int complaintId, String adminComplaintReply, String complaintDescription, boolean compliantStatus,
			Date registeredDate, Date resolvedDate) {
		super();
		this.complaintId = complaintId;
		this.adminComplaintReply = adminComplaintReply;
		this.complaintDescription = complaintDescription;
		this.compliantStatus = compliantStatus;
		this.registeredDate = registeredDate;
		this.resolvedDate = resolvedDate;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getAdminComplaintReply() {
		return adminComplaintReply;
	}

	public void setAdminComplaintReply(String adminComplaintReply) {
		this.adminComplaintReply = adminComplaintReply;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public boolean isCompliantStatus() {
		return compliantStatus;
	}

	public void setCompliantStatus(boolean compliantStatus) {
		this.compliantStatus = compliantStatus;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", adminComplaintReply=" + adminComplaintReply
				+ ", complaintDescription=" + complaintDescription + ", compliantStatus=" + compliantStatus
				+ ", registeredDate=" + registeredDate + ", resolvedDate=" + resolvedDate + "]";
	}
	
	
	
	
}
