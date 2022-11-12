package com.kiran.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.ticketbooking.model.Ticket;
import com.kiran.ticketbooking.service.TicketService;

@RestController
@RequestMapping(value = "/tickets")
//http://localhost:8080/tickets
public class TicketController {

	@Autowired
	private TicketService ticketService;

	// Get All Ticket
	@GetMapping(value = "/all")
	// http://localhost:8080/tickets/all
	public Iterable<Ticket> getAllTicket() {
		return ticketService.getTicket();
	}

	// Get A Ticket
	@GetMapping(value = "/{ticketId}")
	// http://localhost:8080/tickets/1 ==> 1st Ticket
	// http://localhost:8080/tickets/2 ==> 2nd Ticket
	public Ticket getTicket(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicket(ticketId);
	}

	// Update Ticket
	@PutMapping(value = "/{ticketId}/{newEmail}")
	// http://localhost:8080/tickets/1/a@b.com
	// ==>1st Ticket new Email ===> a@b.com
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail") String newEmail) {
		return ticketService.updateTicket(ticketId, newEmail);
	}

	// Create Ticket
	@PostMapping(value = "/create")
	// http://localhost:8080/tickets/create
	public Ticket createTicket(@RequestBody Ticket ticketObj) {
		return ticketService.createTicket(ticketObj);
	}

	// Delete Ticket
	@DeleteMapping(value = "/{ticketId}")
	//http://localhost:8080/tickets/1
	public void deleteTicket(@PathVariable("{ticketId}") Integer ticketId) {
		ticketService.deleteTicket(ticketId);
	}
}
