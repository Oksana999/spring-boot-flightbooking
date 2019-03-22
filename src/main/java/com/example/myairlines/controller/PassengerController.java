package com.example.myairlines.controller;

import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.service.PassengerService;
import com.example.myairlines.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PassengerController {
    @Autowired
    PassengerService passengerService;
    @Autowired
    TicketService ticketService;
    @GetMapping("/redirectToPassenger")
    public String addPassenger(){
        return "passenger";
    }

    @PostMapping("/registration")
    public String passengerRegistration(Model model,
                                        @RequestParam String firstName,
                                        @RequestParam String lastName){
        Passenger passenger = new Passenger();
        passenger.setFirstName(firstName);
        passenger.setLastName(lastName);
        passengerService.createPassenger(passenger);
        model.addAttribute("passenger", passenger);
        return "addPassenger";
    }
}
