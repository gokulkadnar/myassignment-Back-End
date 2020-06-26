package com.assignment.AssignmentProject.Controller;


import com.assignment.AssignmentProject.DTO.ManagerDetailsDto;
import com.assignment.AssignmentProject.Service.ServiceInterfaces.ManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ManagerSignUPController {

    @Autowired
    ManagerService managerService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/manager",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    public ResponseEntity insertManagerDetails(@Valid @RequestBody ManagerDetailsDto managerDetailsDto){
        logger.info("inside the insertManagerDetails method");
        return managerService.insertManagerDetails(managerDetailsDto);
    }
}
