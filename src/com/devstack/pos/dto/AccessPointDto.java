package com.devstack.pos.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccessPointDto {
    private Long propertyId;
    private String pointName;
}
