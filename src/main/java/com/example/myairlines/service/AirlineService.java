package com.example.myairlines.service;

import com.example.myairlines.entitys.Airline;

import java.util.List;

public interface AirlineService {
  //  public void createAirline(Airline airline);
    public Airline createAirline (String name);
    public List<Airline> getAllAirlines();
}
