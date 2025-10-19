package com.karthikproject.cacheimpl;

import com.karthikproject.cacheimpl.Controllers.EmployeeController;
import com.karthikproject.cacheimpl.Exceptions.NoObjectFoundException;
import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Services.EmployeeService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;



import static org.junit.jupiter.api.Assertions.assertEquals;



@SpringBootTest
class CacheimplApplicationTests {

	@Autowired
	EmployeeController employeeController;

	@Autowired
	EmployeeService employeeService;
	Employees employee;

	@BeforeEach
	public void createEmployee(){
		employee= Employees.builder().employeeId(1).employeeName("Karthik P N").deptID(2).email("kpnzeus@gmail.com").build();

	}

	@Test
	void getEmployeeTest(){
		Employees emp1= employeeController.getEmployeesByID(1);

		Assert.notNull(emp1,"Null");
	}

	@DisplayName("Test employee can be saved using service")
	@Test
	@Transactional
	@Rollback
	void saveEmployeeTest(){
		employeeController.saveEmployee(this.employee);
		Employees emp2= employeeController.getEmployeesByID(1);

		Assert.notNull(emp2,"No Object Found");
	}

	@Test
	@DisplayName("No Object found Exception Handler")
	void exceptionHandlerTest(){
		Exception exception= Assertions.assertThrows(NoObjectFoundException.class,()->{
            Math.random();
            employeeController.getEmployeesByID(0);
		});
		assertEquals("Cannot find object with ID",exception.getMessage());
	}



	@Test
	void contextLoads() {
	}

}
