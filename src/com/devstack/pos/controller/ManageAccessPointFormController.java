package com.devstack.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageAccessPointFormController {
    public AnchorPane manageAccessPointContext;
    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("UserRolesAndAuthoritiesForm");
    }


    private void setUi(String location) throws IOException {
        Stage stage = (Stage)manageAccessPointContext.getScene().getWindow();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))
                )
        );
        stage.centerOnScreen();
    }
}
