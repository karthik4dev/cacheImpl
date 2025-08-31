package com.karthikproject.cacheimpl.Configurations;

import com.karthikproject.cacheimpl.DataTransferObjects.DepartmentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8088" , value = "Department-service")
public interface ApiClient {
    @GetMapping("/api-v1/department/{id}")
    DepartmentDTO getDepartmentById(@PathVariable int id);
}
