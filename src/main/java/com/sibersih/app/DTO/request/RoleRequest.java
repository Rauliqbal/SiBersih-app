package com.sibersih.app.DTO.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleRequest {
  @NotBlank(message = "Role name must not be blank")
  private String name;

  @NotBlank(message = "Description must not be blank")
  private String description;
}
