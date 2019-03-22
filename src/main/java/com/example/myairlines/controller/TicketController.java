package com.example.myairlines.controller;

import com.example.myairlines.entitys.Flight;
import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.entitys.Ticket;
import com.example.myairlines.service.FlightService;
import com.example.myairlines.service.PassengerService;
import com.example.myairlines.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TicketController {
    @Autowired
    PassengerService passengerService;
    @Autowired
    FlightService flightService;
    @Autowired
    TicketService ticketService;

    @GetMapping("/redirectToTicket")
    public String addTicketAttributes(Model model){
        List<Passenger> passengers =passengerService.getPassengers();
        model.addAttribute("passengers", passengers);
        List<Flight> flights= flightService.getFlights();
        model.addAttribute("flights", flights);
        return "ticket";
    }

    @PostMapping ("/createTicket")
    public String createTicket(Model model, @RequestParam String place, @RequestParam String passengerId,
                               @RequestParam String flightId){
        Ticket ticket = ticketService.createTicket(flightId, place, passengerId);
        model.addAttribute("ticket", ticket);
        return "addTicket";
    }


}
