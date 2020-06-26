package com.assignment.AssignmentProject.Service.ServiceInterfaces;

import com.assignment.AssignmentProject.DTO.ManagerDetailsDto;
import org.springframework.http.ResponseEntity;

public interface ManagerService {

    public ResponseEntity insertManagerDetails(ManagerDetailsDto managerDetailsDto);
}
