package com.example.myairlines.service;

import com.example.myairlines.entitys.Airline;
import com.example.myairlines.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService {
    @Autowired
    private AirlineRepository airlineRepository;

    @Override
    public Airline createAirline(String name){
        Airline airline = new Airline();
        airline.setName(name);
        airlineRepository.save(airline);
        return airline;
    }

//    @Override
//    public void createAirline(Airline airline) {
//       // airline = new Airline();
//      //  airline.setName(name);
//
//      //  model.addAttribute("airline", airline);
//
//        airlineRepository.save(airline);
//
//    }

    @Override
    public List<Airline> getAllAirlines() {
        List<Airline> airlines = new ArrayList<>();

        /*while (airlineRepository.findAll().iterator().hasNext()){
            Airline airline = airlineRepository.findAll().iterator().next();
            airlines.add(airline);
        }*/


        airlineRepository.findAll().forEach(airlines::add);
        return airlines;
    }

}
