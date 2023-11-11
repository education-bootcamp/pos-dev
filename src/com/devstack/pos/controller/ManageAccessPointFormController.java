package com.devstack.pos.controller;

import com.devstack.pos.bo.BoFactory;
import com.devstack.pos.bo.custom.AccessPointBo;
import com.devstack.pos.dto.AccessPointDto;
import com.devstack.pos.util.KeyGenerator;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageAccessPointFormController {
    public AnchorPane manageAccessPointContext;
    public JFXTextField txtAccessPoint;

    private AccessPointBo accessPointBo = BoFactory.getBo(BoFactory.BoType.ACCESS_POINT);

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

    public void btnSubmitOnAction(ActionEvent actionEvent) {
        if (accessPointBo.createAccessPoint(
                new AccessPointDto( KeyGenerator.generateId(),
                        txtAccessPoint.getText())
        )){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved!", ButtonType.CLOSE).show();
        }
    }
}
