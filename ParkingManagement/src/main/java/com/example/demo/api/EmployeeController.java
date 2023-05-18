package com.example.demo.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.RoleEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.RoleRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@GetMapping("/list")
	public ResponseEntity<?> getListEmployee () {
		return new ResponseEntity<>(employeeRepository.findListEmployee(), HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addEmployee (@RequestBody EmployeeDTO employeeDTO) {
		
		EmployeeEntity employeeEntity = employeeDTO.convertToEntity();
		employeeEntity.setCreateDate(new Date());
		
		List<RoleEntity> roleEntities = new ArrayList<>();
		Optional<RoleEntity> role = roleRepository.findById(employeeDTO.getRoleID());
		if (role.isPresent()) {
			roleEntities.add(role.get());
			
		}
		
		employeeEntity.setRoles(roleEntities);
		employeeRepository.save(employeeEntity);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteEmployee (@RequestBody long id) {
		
		Optional<EmployeeEntity> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			EmployeeEntity opEntity = optional.get();
			opEntity.setDeleted(true);
			employeeRepository.save(opEntity);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployee (@PathVariable("id") Long id) {
		System.out.println(id);
		return new ResponseEntity<>(employeeRepository.findById(id), HttpStatus.ACCEPTED);
	}
	
	
	
}
