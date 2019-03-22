package com.example.myairlines.controller;

import com.example.myairlines.entitys.Airline;
import com.example.myairlines.entitys.Flight;
import com.example.myairlines.service.AirlineService;
import com.example.myairlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FlightController {
    @Autowired
    FlightService flightService;
    @Autowired
    AirlineService airlineService;

    @GetMapping("/redirectToFlight")
    public String addFlight (Model model){
        List<Airline> airlines = airlineService.getAllAirlines();
        model.addAttribute("airlines", airlines);
        return "flight";
    }


//    @PostMapping("/getAllAirlines")
//    public String getAllAirlines(Model model,
//                                 @RequestParam String airlinesSelector,
//                                 @RequestParam Airline airline){
//        List<Airline> airlines= new ArrayList<>();
//        airlines.add(airline);
//        airlineService.getAllAirlines();
//        model.addAttribute("airlines", airlines);
//        return "flight";
//
//    }
    @PostMapping("/createFlight")
    public String createFlight(Model model,
                               @RequestParam String cityDeparture,
                               @RequestParam String cityArrival,
                               @RequestParam String date,
                               @RequestParam String time,
                               @RequestParam String airlineSelector){
       // logger.info("Method createFlight has been invoked for airline: {}", airlineSelector);
       Flight flight = flightService.createFlight(cityDeparture, cityArrival, date, time, airlineSelector);
       model.addAttribute("flight", flight);

        return "addFlight";
    }
}
