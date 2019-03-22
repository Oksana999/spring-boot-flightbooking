package com.example.myairlines.entitys;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
//@Data
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
    @Column
    private String place;
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    public Ticket() {
    }

    public Ticket(Flight flight, String place, Passenger passenger) {
        this.flight = flight;
        this.place = place;
        this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

  /*  @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", flight=" + flight +
                ", place='" + place + '\'' +
                ", passenger=" + passenger +
                '}';
    }*/
}
