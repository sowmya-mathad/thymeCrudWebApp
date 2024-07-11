package com.sgm.spring.thymeCrudWebApp.repo;

import com.sgm.spring.thymeCrudWebApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}