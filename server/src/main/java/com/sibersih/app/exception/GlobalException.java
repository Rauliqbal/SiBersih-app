package com.sibersih.app.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import com.sibersih.app.DTO.response.WebResponse;

import jakarta.validation.ConstraintViolationException;

public class GlobalException {

  @ExceptionHandler(ResponseStatusException.class)
  public ResponseEntity<WebResponse<String>> ResponseStatusException(ResponseStatusException ex) {
    WebResponse<String> response = WebResponse.<String>builder()
        .success(false)
        .message(ex.getReason())
        .build();

    return ResponseEntity.status(ex.getStatusCode()).body(response);
  }

  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<WebResponse<Map<String, String>>> validation(ConstraintViolationException ex) {
    Map<String, String> errors = new HashMap<>();

    ex.getConstraintViolations().forEach(violation -> {
      String field = violation.getPropertyPath().toString();
      errors.put(field, violation.getMessage());
    });

    WebResponse<Map<String, String>> response = WebResponse.<Map<String, String>>builder()
        .success(false)
        .message("Validation failed")
        .data(errors)
        .build();

    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(response);
  }
}
