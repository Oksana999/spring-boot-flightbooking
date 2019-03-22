package com.example.myairlines.entitys;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="passengers")
@Data
public class Passenger {

    @Id
    @GeneratedValue
    @Column(name ="id" )
    private Integer id;
    @Column(name = "first_name")
    private String firstName;//first_name
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(mappedBy = "passenger")
    @ToString.Exclude
    private List<Ticket> tickets;

    public Passenger (){};

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
