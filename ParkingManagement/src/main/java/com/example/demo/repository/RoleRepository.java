package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

	
	@Query(value = "SELECT id,name FROM role", nativeQuery = true)
	List<Object> findListEmployee();
} 
