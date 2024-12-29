package com.karthikproject.cacheimpl.Services;

import com.karthikproject.cacheimpl.Models.Employees;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmployeeService {

    public void saveEmployees(Employees employees);
    public Optional<Employees> getEmployeeById(int id);
}
