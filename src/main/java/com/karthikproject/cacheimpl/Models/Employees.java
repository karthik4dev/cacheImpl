package com.karthikproject.cacheimpl.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",unique = true,nullable = false)
    private int employeeId;
    @Column(name = "Name")
    private String employeeName;
    @Column(name="Department ID")
    private int deptID;
    @Column(name = "Email")
    private String email;

}
