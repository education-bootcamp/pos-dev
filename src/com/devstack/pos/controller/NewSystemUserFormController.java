package com.devstack.pos.controller;

import com.devstack.pos.bo.BoFactory;
import com.devstack.pos.bo.custom.UserRoleBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.UserRoleDao;
import com.devstack.pos.dto.UserRoleDto;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewSystemUserFormController {
    public AnchorPane newSystemUserContext;
    public JFXComboBox<String> cmbUserRole;
    public JFXTextField txtUserName;
    public JFXTextField txtDisplayName;

    private UserRoleBo userRoleBo= BoFactory.getBo(BoFactory.BoType.USER_ROLE);

    private ObservableList<String> observableList= FXCollections.observableArrayList();
    private List<UserRoleDto> userRoleDtos = new ArrayList<>();

    public void initialize(){
        loadAllUserRoles();
    }

    private void loadAllUserRoles() {
        userRoleDtos=userRoleBo.loadAllUserRoles();
        for (UserRoleDto dto: userRoleDtos
             ) {
        observableList.add(dto.getRoleName());
        }
        cmbUserRole.setItems(observableList);
    }

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("UserManagementForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage)newSystemUserContext.getScene().getWindow();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))
                )
        );
        stage.centerOnScreen();
    }

    public void createSystemUser(ActionEvent actionEvent) {
    }
}
