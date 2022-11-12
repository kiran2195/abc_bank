package com.kiran.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.ticketbooking.dao.TicketDao;
import com.kiran.ticketbooking.model.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketDao ticketDao;

	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}

	// Retrive all ticket
	public Iterable<Ticket> getTicket() {
		return ticketDao.findAll();
	}

	// Retrive a particulae ticker
	public Ticket getTicket(Integer ticketId) {
		return ticketDao.findById(ticketId).orElse(new Ticket());
	}

	// update
	public Ticket updateTicket(Integer ticketId,String newEmail){

		Ticket dbTicketObj = getTicket(ticketId);

		dbTicketObj.setEmail(newEmail);
		return ticketDao.save(dbTicketObj);
	}
	//Delete Ticket
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}
	
	
}
