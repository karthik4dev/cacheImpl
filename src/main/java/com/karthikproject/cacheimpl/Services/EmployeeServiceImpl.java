package com.karthikproject.cacheimpl.Services;

import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Repositories.EmployeeRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Logger;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public void saveEmployees(Employees employees) {
        employeeRepository.save(employees);
    }

    @Cacheable(cacheNames = "employee")
    @Override
    public Optional<Employees> getEmployeeById(int id) {
        log.info("it is taking by Server");
        return employeeRepository.findById(id);

    }


}
