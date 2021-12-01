package com.zaurtregulov.spring.springboot.spring_datarest.dao;

import com.zaurtregulov.spring.springboot.spring_datarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}


