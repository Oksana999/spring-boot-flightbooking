package com.example.myairlines.controller;

import com.example.myairlines.entitys.Airline;
import com.example.myairlines.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AirlineController {
    @Autowired
    private AirlineService airlineService;

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping ("/redirectToAirline")
    public String addAirline(){
        return "airline";
    }

    @PostMapping("/createAirline")
        public String createAirline (Model model,
                                     @RequestParam String name){
       Airline  airline = airlineService.createAirline(name);
//        Airline airline = new Airline();
//        airline.setName(name);
    //   airlineService.createAirline(airline);
      model.addAttribute("airline", airline);
        return  "addAirline";
    }

}
