package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.RoleRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/role")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/list")
	public ResponseEntity<?> getListRole () {
		return new ResponseEntity<>(roleRepository.findListEmployee(), HttpStatus.OK);
	}
}
