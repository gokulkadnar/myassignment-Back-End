package com.assignment.AssignmentProject.Dao;

import com.assignment.AssignmentProject.Domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
