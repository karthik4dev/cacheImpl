package com.karthikproject.cacheimpl.DataTransferObjects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
public class DepartmentDTO {
   private int id;
   private String name;
   private ArrayList<Integer> empId;

}
