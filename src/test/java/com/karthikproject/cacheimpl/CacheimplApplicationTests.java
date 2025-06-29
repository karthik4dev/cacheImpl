package com.karthikproject.cacheimpl;

import com.karthikproject.cacheimpl.Controllers.EmployeeController;
import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Services.EmployeeService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.Rollback;

import org.springframework.util.Assert;



@SpringBootTest
class CacheimplApplicationTests {

	@Autowired
	EmployeeController employeeController;

	@Autowired
	EmployeeService employeeService;

	@Test
	void getEmployeeTest(){
		Employees emp1= employeeController.getEmployeesByID(1).orElseThrow();

		Assert.notNull(emp1,"Null");
	}

	@Test
	@Transactional
	@Rollback
	void saveEmployeeTest(){
		Employees emp1= Employees.builder().employeeId(1).employeeName("Karthik P N").deptID(2).email("kpnzeus@gmail.com").build();

		employeeController.saveEmployee(emp1);
		Employees emp2= employeeController.getEmployeesByID(1).orElseThrow();

		Assert.notNull(emp2,"No Object Found");
	}



	@Test
	void contextLoads() {
	}

}
