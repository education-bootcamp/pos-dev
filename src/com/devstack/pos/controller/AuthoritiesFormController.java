package com.devstack.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.IOException;

public class AuthoritiesFormController {
    public AnchorPane authoritiesContext;
    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("UserRolesAndAuthoritiesForm");
    }


    private void setUi(String location) throws IOException {
        Stage stage = (Stage)authoritiesContext.getScene().getWindow();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))
                )
        );
        stage.centerOnScreen();
    }

    public void openModalOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/AuthorityDetailsForm.fxml"));
        Parent parent = loader.load();
        AuthorityDetailsFormController controller = loader.getController();
        controller.initializeData("code is here");
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle("Authority Details");
        stage.show();
    }
}
