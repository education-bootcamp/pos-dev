package com.devstack.pos.dto;

import lombok.*;

import javax.persistence.Column;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDto {
    private  Long propertyId;
    private String roleName;
    private String roleDescription;
}
