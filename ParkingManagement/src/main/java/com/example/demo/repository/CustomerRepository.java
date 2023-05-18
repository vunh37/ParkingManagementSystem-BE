package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{
	
	@Query(value = "SELECT id,name,address FROM customer where is_deleted = 0 order by id desc", nativeQuery = true)
	List<Object> findListCustomer();
}
