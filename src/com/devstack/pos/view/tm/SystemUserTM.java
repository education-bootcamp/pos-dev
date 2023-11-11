package com.devstack.pos.view.tm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SystemUserTM {
    private Long userId;
    private String userRole;
    private String status;
    private String displayName;
    private String email;
    private Button delete;
    private Button modify;
}
