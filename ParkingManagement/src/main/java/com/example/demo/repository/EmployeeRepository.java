package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
	EmployeeEntity findOneByUserName(String userName);
	
	@Query(value = "SELECT id,name,address FROM employee where is_deleted = 0 order by id desc", nativeQuery = true)
	List<Object> findListEmployee();
}
