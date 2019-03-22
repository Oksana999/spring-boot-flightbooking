package com.example.myairlines.service;

import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public void createPassenger (Passenger passenger){

        passengerRepository.save(passenger);

    }
    public List<Passenger> getPassengers() {
        List<Passenger> passengers = new ArrayList();
        passengerRepository.findAll().forEach(passengers::add);
        //repository.findAll().forEach(passenger -> passengers.add(passenger));
        return passengers;
    }


}
