package com.karthikproject.cacheimpl.DataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class APIDTO {
    private int id;
    private String name;
    private int deptID;
    private String email;
    private String DeptName;
}
