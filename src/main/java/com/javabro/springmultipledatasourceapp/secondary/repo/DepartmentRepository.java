package com.javabro.springmultipledatasourceapp.secondary.repo;

import com.javabro.springmultipledatasourceapp.secondary.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
