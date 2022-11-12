package com.kiran.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kiran.ticketbooking.model.Ticket;
import com.kiran.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingAppApplication implements CommandLineRunner {

	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ticket ticket = new Ticket();
		ticket.setDestinationStation("Pune");
		ticket.setEmail("kiran@gmail.com");
		ticket.setPassanfgerName("Kiran");
		ticket.setSourceStation("Aurangabad");
		ticket.setTravleDate(new Date());
		ticketService.createTicket(ticket);
		
		
	}
}
