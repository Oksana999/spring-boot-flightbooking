package com.example.myairlines.repository;

import com.example.myairlines.entitys.Passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
}
