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
        Employees employee1=Employees.builder().employeeName(employees.getEmployeeName())
                .email(employees.getEmail()).deptID(employees.getDeptID()).build();
        log.info("Employee "+employee1.getEmployeeName()+" saved to H2");
        employeeRepository.save(employee1);
    }

    @Cacheable(cacheNames = "employee")
    @Override
    public Optional<Employees> getEmployeeById(int id) {
        log.info("it is taking by Server");
        return employeeRepository.findById(id);

    }


}
