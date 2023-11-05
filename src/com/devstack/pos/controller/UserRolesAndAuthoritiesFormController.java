package com.devstack.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserRolesAndAuthoritiesFormController {
    public AnchorPane userRoleAndAuthorityContext;

    public void backToHome(ActionEvent actionEvent) throws IOException {
        setUi("UserManagementForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage)userRoleAndAuthorityContext.getScene().getWindow();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))
                )
        );
        stage.centerOnScreen();
    }

    public void manageUserRoleOnAction(MouseEvent mouseEvent) {
    }

    public void managePrivilegesOnAction(MouseEvent mouseEvent) {
    }

    public void authoritiesOnAction(MouseEvent mouseEvent) {
    }

    public void manageAccessPointOnAction(MouseEvent mouseEvent) {

    }
}
