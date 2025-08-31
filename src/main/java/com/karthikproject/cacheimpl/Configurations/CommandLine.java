package com.karthikproject.cacheimpl.Configurations;

import com.karthikproject.cacheimpl.Services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(CommandLine.class);
    @Autowired
    EmployeeService employeeService;


    @Override
    public void run(String... args) throws Exception {
        Thread.sleep(1000);
        log.warn("Sleep for 10 secs");
        System.err.printf("%s\n",Thread.currentThread());
    }

}

