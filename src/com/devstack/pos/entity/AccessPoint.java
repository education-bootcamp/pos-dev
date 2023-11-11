package com.devstack.pos.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AccessPoint implements SuperEntity{
    @Id
    @Column(name = "property_id")
    private Long propertyId;
    @Column(name="point_name")
    private String pointName;
}
