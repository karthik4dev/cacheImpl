package com.karthikproject.cacheimpl.Configurations;

import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


import java.util.ArrayList;

@Slf4j
public class CommandLine implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {


        Employees John=Employees.builder().EmployeeId(1).EmployeeName("John").email("JohnDoe@gmail.com").DeptID(2).build();
        Employees Francis=Employees.builder().EmployeeId(2).EmployeeName("Francis").email("Francissebastian@gmail.com").DeptID(2).build();
        Employees Marcin=Employees.builder().EmployeeId(3).EmployeeName("Marcin").email("Marcinkingluther@gmail.com").DeptID(1).build();
        Employees Josefine=Employees.builder().EmployeeId(4).EmployeeName("Josefine").email("JosefineGregorz@gmail.com").DeptID(1).build();

        ArrayList<Employees> employees= new ArrayList<>();
        employees.add(John);
        employees.add(Francis);
        employees.add(Marcin);
        employees.add(Josefine);
        log.info("Adding employees to DB");
        employeeRepository.saveAll(employees);

    }
}
