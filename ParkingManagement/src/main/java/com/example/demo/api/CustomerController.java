package com.example.demo.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.RoleEntity;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.RoleRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository  customerRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@GetMapping("/list")
	public ResponseEntity<?> getListCustomer () {
		return new ResponseEntity<>(customerRepository.findListCustomer(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addEmployee (@RequestBody CustomerDTO customerDTO) {
		
		CustomerEntity customerEntity = customerDTO.convertToEntity();
		customerEntity.setCreateDate(new Date());
		
		customerRepository.save(customerEntity);
		System.out.println("them thanh cong");
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteEmployee (@RequestBody long id) {
		
		Optional<CustomerEntity> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			CustomerEntity opEntity = optional.get();
			opEntity.setDeleted(true);
			customerRepository.save(opEntity);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployee (@PathVariable("id") Long id) {

		return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.ACCEPTED);
	}
}
