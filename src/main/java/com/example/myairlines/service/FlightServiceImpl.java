package com.example.myairlines.service;

import com.example.myairlines.entitys.Airline;
import com.example.myairlines.entitys.Flight;
import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.repository.AirlineRepository;
import com.example.myairlines.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    private AirlineRepository airlineRepository;
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight createFlight(String cityDeparture, String cityArrival, String date, String time,
                               String airlineSelector) {

        Flight flight = new Flight();
        flight.setCityDeparture(cityDeparture);
        flight.setCityArrival(cityArrival);
        LocalDate flightDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalTime flightTime = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm"));
        LocalDateTime dateTime = LocalDateTime.of(flightDate, flightTime);
        flight.setDate(dateTime);

        Airline airline = airlineRepository
                .findById(Integer.valueOf(airlineSelector))
                .orElseThrow(IllegalArgumentException::new);
        flight.setAirline(airline);
        flightRepository.save(flight);

        return flight;
    }

    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList();
        flightRepository.findAll().forEach(flights::add);
        //repository.findAll().forEach(passenger -> passengers.add(passenger));
        return flights;
    }
}
