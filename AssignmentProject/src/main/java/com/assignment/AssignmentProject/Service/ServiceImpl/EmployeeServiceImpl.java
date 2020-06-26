package com.assignment.AssignmentProject.Service.ServiceImpl;


import com.assignment.AssignmentProject.DTO.EmployeeDetailsDto;
import com.assignment.AssignmentProject.Dao.EmployeeRepository;
import com.assignment.AssignmentProject.Dao.ManagerRepository;
import com.assignment.AssignmentProject.Domain.Employee;
import com.assignment.AssignmentProject.Domain.Manager;
import com.assignment.AssignmentProject.ExceptionHandler.CustomizeErrorMsg;
import com.assignment.AssignmentProject.Service.ServiceInterfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ManagerRepository managerRepository;


    @Override
    public ResponseEntity insertEmployeeDetails(EmployeeDetailsDto employeeDetailsDto, Integer managerId) {
        // check for manager id;
        Optional<Manager> manager = managerRepository.findById(managerId);
        if (manager == null){
            CustomizeErrorMsg customizeErrorMsg = new CustomizeErrorMsg();
            customizeErrorMsg.setErrorMessage("Invalid ManagerId");
            return ResponseEntity.ok(customizeErrorMsg);
        }
        Employee employee = new Employee();
        employee.setAddress(employeeDetailsDto.getAddress());
        employee.setCity(employeeDetailsDto.getCity());
        employee.setDob(employeeDetailsDto.getDob());
        employee.setFirstName(employeeDetailsDto.getFirstName());
        employee.setLastName(employeeDetailsDto.getLastName());
        // saving employee records into the table
        employeeRepository.save(employee);
        return ResponseEntity.ok(employee);
    }
}
