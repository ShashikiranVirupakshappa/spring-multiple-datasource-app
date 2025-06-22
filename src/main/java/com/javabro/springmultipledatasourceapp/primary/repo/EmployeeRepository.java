package com.javabro.springmultipledatasourceapp.primary.repo;

import com.javabro.springmultipledatasourceapp.primary.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
