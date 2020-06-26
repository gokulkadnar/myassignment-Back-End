package com.assignment.AssignmentProject.Dao;

import com.assignment.AssignmentProject.Domain.Manager;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ManagerRepository extends CrudRepository<Manager,Integer> {

    Manager findByEmail(String email);
}
