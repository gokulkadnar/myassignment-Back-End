package com.assignment.AssignmentProject.Controller;

import com.assignment.AssignmentProject.DTO.EmployeeDetailsDto;
import com.assignment.AssignmentProject.Service.ServiceInterfaces.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ManagerLoginController {

    @Autowired
    EmployeeService employeeService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/employee/{manager-id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    public ResponseEntity insertEmployeeDetails(@Valid @RequestBody EmployeeDetailsDto employeeDetailsDto, @PathVariable(value = "manager-id") Integer managerId){
        logger.info("inside the insertEmployeeDetails method");
        return employeeService.insertEmployeeDetails(employeeDetailsDto,managerId);
    }

}
