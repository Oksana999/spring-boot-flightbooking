package com.example.myairlines;

import com.example.myairlines.entitys.Airline;
import com.example.myairlines.entitys.Flight;
import com.example.myairlines.entitys.Passenger;
import com.example.myairlines.entitys.Ticket;
import com.example.myairlines.repository.AirlineRepository;
import com.example.myairlines.repository.FlightRepository;
import com.example.myairlines.repository.PassengerRepository;
import com.example.myairlines.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class MyairlinesApplication /*implements CommandLineRunner*/ extends SpringBootServletInitializer {

    @Autowired
    private AirlineRepository airlineRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private FlightRepository flightRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyairlinesApplication.class, args);
    }

   /* @Override
    public void run(String... args) throws Exception {
        Airline airline = new Airline();
        airline.setName("MyAirline");
        airlineRepository.save(airline);

        Passenger passenger = new Passenger();
        passenger.setFirstName("Sasha");
        passenger.setLastName("Ross");
        passengerRepository.save(passenger);

        Flight flight = new Flight();
        flight.setAirline(airline);
        flight.setCityArrival("SF");
        flight.setCityDeparture("Tokio");
      //  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime date = LocalDateTime.now();
        flight.setDate(date);
        flightRepository.save(flight);

        Ticket ticket = new Ticket();
        ticket.setPassenger(passenger);
        ticket.setFlight(flight);
        ticket.setPlace("1_A");
        ticketRepository.save(ticket);

    }*/
}
