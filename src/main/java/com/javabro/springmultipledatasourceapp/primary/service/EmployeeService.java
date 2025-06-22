package com.javabro.springmultipledatasourceapp.primary.service;

import com.javabro.springmultipledatasourceapp.primary.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
}
