package com.example.myairlines.controller;

import com.example.myairlines.entitys.Airline;
import com.example.myairlines.entitys.Flight;
import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.service.AirlineService;
import com.example.myairlines.service.FlightService;
import com.example.myairlines.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Controller
//@RestController
public class ApiController {
    @Autowired
    private PassengerService passengerService;
    @Autowired
    private AirlineService airlineService;
    @Autowired
    private FlightService flightService;

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);


    @GetMapping("/hello") //localhost:8090/hello
    //@RequestMapping(method = RequestMethod.GET, value="/hello")
    //@ResponseBody
    public String helloWorld() {
        return "Hi";
    }

//    @GetMapping("/")
//    public String homePage (){
//        return "index";
//    }

//    @GetMapping("/redirectToPassenger")
//    public String addPassenger(){
//        return "passenger";
//    }

//    @GetMapping("/redirectToAirline")
//    public String addAirline(){
//        return "airline";
//    }

//    @GetMapping("/redirectToFlight")
//    public String addFlight(Model model){
//        List<Airline> airlines= airlineService.getAllAirlines();
//        model.addAttribute("airlines", airlines);
//        return "flight";
//    }

//    @PostMapping("/registration")
//    public String passengerRegistration(Model model,
//                                        @RequestParam String firstName,
//                                        @RequestParam String lastName){
//        Passenger passenger = new Passenger();
//        passenger.setFirstName(firstName);
//        passenger.setLastName(lastName);
//        passengerService.createPassenger(passenger);
//        model.addAttribute("passenger",passenger);
//        return "addPassenger";
//    }





//    @PostMapping("/createAirline")
//    public String createAirline(Model model,
//                                @RequestParam String name){
//        Airline airline = new Airline();
//        airline.setName(name);
//        airlineService.createAirline(airline);
//        model.addAttribute("airline", airline);
//        return "addAirline";
//    }





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


//    @PostMapping("/createFlight")
//    public String createFlight(Model model,
//                               @RequestParam String cityDeparture,
//                               @RequestParam String cityArrival,
//                               @RequestParam String date,
//                               @RequestParam String time,
//                               @RequestParam String airlineSelector){
//        logger.info("Method createFlight has been invoked for airline: {}", airlineSelector);
//       flightService.createFlight(cityDeparture, cityArrival, date, time, airlineSelector);
//
//        return "flight";
//   }

}
