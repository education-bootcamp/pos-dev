package com.devstack.pos;

import com.devstack.pos.dao.custom.UserRoleDao;
import com.devstack.pos.dao.custom.impl.UserRoleDaoImpl;
import com.devstack.pos.db.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {



        URL resource = getClass().getClassLoader().getResource("com/devstack/pos/view/LoginForm.fxml");
        Parent parent = FXMLLoader.load(resource);
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("POS");
        primaryStage.show();


        try(Session session= HibernateUtil.getSession()){

        }

    }

    private void initializeData(){
        UserRoleDao userRoleDao= new UserRoleDaoImpl();
        if (!userRoleDao.isExists()){



        }else{
            return;
        }

    }

}
