package com.example.myairlines.service;

import com.example.myairlines.entitys.Flight;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FlightService {
    public Flight createFlight (String cityDeparture, String cityArrival, String  date,
                                String time, String airlineSelector);

    public List<Flight> getFlights();


}
