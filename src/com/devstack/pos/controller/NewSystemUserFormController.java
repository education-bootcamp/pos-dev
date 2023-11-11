package com.devstack.pos.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
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

    private List<String> roles= new ArrayList<>();

    public void initialize(){
        loadAllUserRoles();
    }

    private void loadAllUserRoles() {

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
