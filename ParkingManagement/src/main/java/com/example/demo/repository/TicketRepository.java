package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Long>{

}
