package com.example.myairlines.service;

import com.example.myairlines.entitys.Ticket;

public interface TicketService {
    public Ticket createTicket(String flightId, String place, String passengerId);
}
