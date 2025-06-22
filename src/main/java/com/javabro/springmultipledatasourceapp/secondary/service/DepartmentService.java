package com.javabro.springmultipledatasourceapp.secondary.service;

import com.javabro.springmultipledatasourceapp.secondary.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
}
