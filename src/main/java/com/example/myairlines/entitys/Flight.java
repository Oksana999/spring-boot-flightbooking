package com.example.myairlines.entitys;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "flights")
//@Data
@Getter
@Setter
public class Flight {
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column
    private String cityDeparture;
    @Column
    private String cityArrival;
    @Column
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;
    @OneToMany(mappedBy = "flight")
    @ToString.Exclude
    private List<Ticket> tickets;

    public Flight() {
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return cityDeparture +" "+cityArrival+" "+date+" "+airline.getName();

    }
}
