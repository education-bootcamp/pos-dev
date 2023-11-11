package com.devstack.pos.controller;

import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.UserDao;
import com.devstack.pos.dao.custom.impl.UserDaoImpl;
import com.devstack.pos.util.ResponseData;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginContext;
    public TextField txtUsername;
    public PasswordField txtPassword;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {


        UserDao userDao = DaoFactory.getDao(DaoFactory.DaoType.USER);
        ResponseData data = userDao.login(txtUsername.getText().trim(), txtPassword.getText().trim());
        if(null!=data){
            if((boolean)data.getData()){

                Stage stage = (Stage)loginContext.getScene().getWindow();
                stage.setScene(
                        new Scene(
                                FXMLLoader.load(getClass().getResource("../view/AdminPortalForm.fxml"))
                        )
                );
                stage.centerOnScreen();
                new Alert(Alert.AlertType.INFORMATION, data.getMessage()).show();
            }else{
                new Alert(Alert.AlertType.WARNING,data.getMessage()).show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING,"Something went wrong!").show();
        }
    }
}
