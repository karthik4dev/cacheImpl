package com.karthikproject.cacheimpl.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
public class Employees {
    @Id
    private int EmployeeId;
    private String EmployeeName;
    private int DeptID;
    private String email;
}
