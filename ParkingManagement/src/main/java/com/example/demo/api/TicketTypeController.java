package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TicketEntity;
import com.example.demo.entity.TicketTypeEntity;
import com.example.demo.repository.TicketTypeRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/ticket-type")
public class TicketTypeController {
	
	
	@Autowired
	private TicketTypeRepository ticketTypeRepository;
	
	@GetMapping("/list")
	public ResponseEntity<?> getListTicketType () {
		
		
		return new ResponseEntity<>(ticketTypeRepository.findAll() , HttpStatus.ACCEPTED);
	}
}
