package com.example.myairlines.repository;

import com.example.myairlines.entitys.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
