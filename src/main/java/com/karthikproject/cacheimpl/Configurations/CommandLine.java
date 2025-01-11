package com.karthikproject.cacheimpl.Configurations;

import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Repositories.EmployeeRepository;
import com.karthikproject.cacheimpl.Services.EmployeeService;
import com.karthikproject.cacheimpl.Services.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


import java.util.ArrayList;

@Slf4j
public class CommandLine implements CommandLineRunner {
    @Autowired
    EmployeeService employeeService;


    @Override
    public void run(String... args) throws Exception {
        Thread.sleep(1000);
        log.warn("sleeping for 10 secs");
        System.err.printf("%s\n",Thread.currentThread());
    }

}

