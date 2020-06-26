package com.assignment.AssignmentProject.Service.ServiceImpl;


import com.assignment.AssignmentProject.DTO.ManagerDetailsDto;
import com.assignment.AssignmentProject.Dao.ManagerRepository;
import com.assignment.AssignmentProject.Domain.Manager;
import com.assignment.AssignmentProject.ExceptionHandler.CustomizeErrorMsg;
import com.assignment.AssignmentProject.Service.ServiceInterfaces.ManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public ResponseEntity insertManagerDetails(ManagerDetailsDto managerDetailsDto) {
        logger.info("inside the Implementation method insertManagerDetails");
        Manager manager = new Manager();
        manager.setAddress(managerDetailsDto.getAddress());
        manager.setCompany(managerDetailsDto.getCompany());
        manager.setDob(managerDetailsDto.getDob());
        // check for duplicate email entry
        Manager checkForDuplicateEmail = managerRepository.findByEmail(managerDetailsDto.getEmail());
        if (checkForDuplicateEmail != null) {
            CustomizeErrorMsg customizeErrorMsg = new CustomizeErrorMsg();
            customizeErrorMsg.setErrorMessage("Duplicate Email Entry");
            return ResponseEntity.ok(customizeErrorMsg);
        }
        manager.setFirstName(managerDetailsDto.getFirstName());
        manager.setLastName(managerDetailsDto.getLastName());
        manager.setPassword(managerDetailsDto.getPassword());
        managerRepository.save(manager);
        return ResponseEntity.ok(manager);
    }
}
