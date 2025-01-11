package com.karthikproject.cacheimpl;

import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Services.EmployeeService;
import com.karthikproject.cacheimpl.Services.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.ArrayList;

@EnableCaching
@Slf4j
@SpringBootApplication
public class CacheimplApplication {
	public static void main(String[] args) {
		SpringApplication.run(CacheimplApplication.class, args);
	}

}
