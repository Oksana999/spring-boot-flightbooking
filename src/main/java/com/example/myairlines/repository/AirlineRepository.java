package com.example.myairlines.repository;

import com.example.myairlines.entitys.Airline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends CrudRepository <Airline, Integer> {
}

//Integer - type of index airline