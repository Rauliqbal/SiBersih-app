package com.sibersih.app.services;

import com.sibersih.app.DTO.request.RoleRequest;
import com.sibersih.app.entity.Roles;
import com.sibersih.app.repositories.RoleRepository;
import com.sibersih.app.repositories.UserRepository;
import javax.management.relation.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

import java.util.Set;

@Service
public class RoleService {
  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  UserRepository userRepository;

  @Autowired
  private Validator validator;

  @Transactional
  public void create(RoleRequest request) {
    // Validate the input
    Set<ConstraintViolation<RoleRequest>> constraintViolations = validator.validate(request);

    if (!constraintViolations.isEmpty()) {
      throw new ConstraintViolationException(constraintViolations);
    }

    if (roleRepository.existsByName(request.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Role with name " + request.getName() + " already exists");
    }

    // Create a new role entity
    Roles role = new Roles();
    role.setName(request.getName());
    role.setDescription(request.getDescription());

    // Save the role to the database
    roleRepository.save(role);
  }
}
