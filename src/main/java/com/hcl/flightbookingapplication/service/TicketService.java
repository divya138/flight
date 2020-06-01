package com.hcl.flightbookingapplication.service;

import com.hcl.flightbookingapplication.dto.TicketDetailsDto;
import com.hcl.flightbookingapplication.exception.TicketNotFoundException;
public interface TicketService {
	
	public TicketDetailsDto getTicketById(int id) throws TicketNotFoundException;
	

}
