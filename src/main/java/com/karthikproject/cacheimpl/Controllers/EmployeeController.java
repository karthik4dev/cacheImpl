package com.karthikproject.cacheimpl.Controllers;

import com.karthikproject.cacheimpl.DataTransferObjects.APIDTO;
import com.karthikproject.cacheimpl.Exceptions.NoObjectFoundException;
import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/{id}")
    public Employees getEmployeesByID(@PathVariable int id){
        return employeeService.getEmployeeById(id).orElseThrow(() -> new NoObjectFoundException("Cannot find object with ID"));
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employees employees){
        employeeService.saveEmployees(employees);
    }

    @GetMapping("/api/{id}")
    public APIDTO getWholeAPI(@PathVariable int id){
        return employeeService.getAPI(id);
    }
}
