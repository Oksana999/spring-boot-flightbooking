package com.example.myairlines.entitys;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "airlines")
@Data // Constructor + get + set
@Getter
@Setter
public class Airline {
    @Id
    @GeneratedValue
    @Column ()
    private Integer id;
    @Column
    private String name;

    @OneToMany(mappedBy = "airline")
    private List<Flight> flights;

    public Airline() {
    }

    public Airline(String name, List<Flight> flights) {
        this.name = name;
        this.flights = flights;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

  /*  @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flights=" + flights +
                '}';
    }*/
}
