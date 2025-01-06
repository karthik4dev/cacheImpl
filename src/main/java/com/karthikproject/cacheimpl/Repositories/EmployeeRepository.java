package com.karthikproject.cacheimpl.Repositories;

import com.karthikproject.cacheimpl.Models.Employees;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
}
