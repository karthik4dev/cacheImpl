package com.karthikproject.cacheimpl.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String employeeName;
    private int deptID;
    private String email;

    Employees(){}
}
