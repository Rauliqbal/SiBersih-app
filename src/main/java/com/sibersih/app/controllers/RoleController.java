package com.sibersih.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.sibersih.app.DTO.request.RoleRequest;
import com.sibersih.app.DTO.response.WebResponse;
import com.sibersih.app.services.RoleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
  @Autowired
  private RoleService roleService;

  @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public WebResponse<String> createRole(@Valid @RequestBody RoleRequest request) {
   roleService.create(request);

    return WebResponse.<String>builder()
      .success(true)
      .message("Role created successfully")
      .build();
  }
}
