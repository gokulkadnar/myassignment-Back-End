package com.assignment.AssignmentProject.Service.ServiceInterfaces;


import com.assignment.AssignmentProject.DTO.EmployeeDetailsDto;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    public ResponseEntity insertEmployeeDetails(EmployeeDetailsDto employeeDetailsDto, Integer managerId);
}
