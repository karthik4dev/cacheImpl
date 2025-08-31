package com.karthikproject.cacheimpl.Services;

import com.karthikproject.cacheimpl.Configurations.ApiClient;
import com.karthikproject.cacheimpl.DataTransferObjects.APIDTO;
import com.karthikproject.cacheimpl.DataTransferObjects.DepartmentDTO;
import com.karthikproject.cacheimpl.Models.Employees;
import com.karthikproject.cacheimpl.Repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private ApiClient apiClient;


    @Override
    public APIDTO getAPI(int id) {
        Employees employees=employeeRepository.findById(id).orElseThrow();
        DepartmentDTO departmentDTO= apiClient.getDepartmentById(employees.getDeptID());
        return APIDTO.builder()
                .id(employees.getEmployeeId())
                .name(employees.getEmployeeName())
                .deptID(departmentDTO.getId())
                .DeptName(departmentDTO.getName())
                .email(employees.getEmail()).build();
    }


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
        log.info("Taking by server");
        return employeeRepository.findById(id);

    }


}
