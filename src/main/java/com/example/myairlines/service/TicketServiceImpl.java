package com.example.myairlines.service;

import com.example.myairlines.entitys.Flight;
import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.entitys.Ticket;
import com.example.myairlines.repository.FlightRepository;
import com.example.myairlines.repository.PassengerRepository;
import com.example.myairlines.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket createTicket(String flightId, String place, String passengerId) {
        Ticket ticket = new Ticket();
        ticket.setPlace(place);

        Flight flight = flightRepository
                .findById(Integer.valueOf(flightId))
                .orElseThrow(()-> new IllegalArgumentException());
        //.orElseThrow(IllegalArgumentException::new)
        ticket.setFlight(flight);

        Passenger passenger = passengerRepository
                                .findById(Integer.valueOf(passengerId))
                                .orElseThrow(IllegalArgumentException::new);
        ticket.setPassenger(passenger);

        ticketRepository.save(ticket);
        return ticket;
    }
}
