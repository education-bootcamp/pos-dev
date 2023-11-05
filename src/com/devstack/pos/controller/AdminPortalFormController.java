package com.devstack.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminPortalFormController {
    public AnchorPane adminPortalContext;

    public void userManagementOnAction(ActionEvent actionEvent) throws IOException {
        setUi("UserManagementForm");
    }

    public void userRolesAndAuthoritiesOnAction(ActionEvent actionEvent) {
    }

    public void incomeAndReportOnAction(ActionEvent actionEvent) {
    }

    public void manageInventoryOnAction(ActionEvent actionEvent) {
    }

    public void customerManagementOnAction(ActionEvent actionEvent) {
    }

    public void salesAndDiscountOnAction(ActionEvent actionEvent) {
    }

    public void ReportAndStatisticsOnAction(ActionEvent actionEvent) {
    }
    public void userActivitiesOnAction(ActionEvent actionEvent) {
    }


    private void setUi(String location) throws IOException {
        Stage stage = (Stage)adminPortalContext.getScene().getWindow();
        stage.setScene(
                new Scene(
                        FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))
                )
        );
        stage.centerOnScreen();
    }

}
