package com.stackroute.juggler.ticketengine.service;

import java.text.ParseException;

import com.stackroute.juggler.kafka.domain.MovieSchedule;
import com.stackroute.juggler.kafka.domain.TicketDetails;
import com.stackroute.juggler.ticketengine.domain.Seat;
import com.stackroute.juggler.ticketengine.domain.Show;

public interface SeatsService {

	public void getDetails(MovieSchedule movieSchedule) throws ParseException;

	public Show getById(String showId);

	public Seat findById(String showId);

	public void getBookedSeats(TicketDetails ticketDetails);
	
	
	
}

