package com.kiran.ticketbooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table (name="tbl_ticket")
@DynamicUpdate
public class Ticket {
	

	@Id
	@Column(name="ticket_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ticketId;

	@Column(name ="passanger_name")
	private String passangerName;
	
	@Column(name="travle_date")
	private Date travleDate;
	
	@Column(name="source_station")
	private String sourceStation;

	@Column(name="destination_station")
	private String destinationStation;
	
	private String email;
        
        private String address;

        priavte String sirname; 

	public Ticket(String passanfgerName, String sourceStation, String destinationStation,
			String email) {
		super();
		this.passangerName = passanfgerName;
		this.travleDate = new Date();
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.email = email;
		
		
	}

	public Ticket() {
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassanfgerName() {
		return passangerName;
	}

	public void setPassanfgerName(String passanfgerName) {
		this.passangerName = passanfgerName;
	}

	public Date getTravleDate() {
		return travleDate;
	}

	public void setTravleDate(Date travleDate) {
		this.travleDate = travleDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passangerName=" + passangerName + ", travleDate=" + travleDate
				+ ", sourceStation=" + sourceStation + ", destinationStation=" + destinationStation + ", email=" + email
				+ "]";
	}
	
	
	
}
