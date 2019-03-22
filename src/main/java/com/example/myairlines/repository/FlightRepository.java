package com.example.myairlines.repository;

import com.example.myairlines.entitys.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository <Flight, Integer> {
}
