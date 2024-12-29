package com.karthikproject.cacheimpl.Controllers;

import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/{id}")
    public Optional<Employees> getEmployeesByID(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
}
