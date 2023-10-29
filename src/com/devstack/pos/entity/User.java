package com.devstack.pos.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements SuperEntity{
    @Id
    @Column(name = "property_id")
    private  Integer propertyId;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "display_name", nullable = false)
    private String displayName;
    @Column(name = "active_state")
    private boolean activeState;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;
}
