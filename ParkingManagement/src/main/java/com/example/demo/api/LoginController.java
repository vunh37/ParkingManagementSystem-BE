package com.example.demo.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO ) {
		EmployeeEntity e = employeeRepository.findOneByUserName(loginDTO.getUserName());
		if (e == null || !e.getPassword().equals(loginDTO.getPassword())) {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		Map<String, Object> response = new HashMap<>();
		response.put("userID", e.getId());
		response.put("userName", e.getUserName());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
}
