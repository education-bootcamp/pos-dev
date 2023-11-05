package com.devstack.pos;

import com.devstack.pos.dao.custom.UserRoleDao;
import com.devstack.pos.dao.custom.impl.UserRoleDaoImpl;
import com.devstack.pos.db.HibernateUtil;
import com.devstack.pos.entity.User;
import com.devstack.pos.entity.UserRole;
import com.devstack.pos.util.KeyGenerator;
import com.devstack.pos.util.PasswordGenerator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        initializeData();

        URL resource = getClass().getClassLoader().getResource("com/devstack/pos/view/LoginForm.fxml");
        Parent parent = FXMLLoader.load(resource);
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("POS");
        primaryStage.show();


    }

    private void initializeData(){
        UserRoleDao userRoleDao= new UserRoleDaoImpl();
        if (!userRoleDao.isExists()){

            try(Session session= HibernateUtil.getSession()){
                Transaction transaction = session.beginTransaction();
                UserRole adminRole = new UserRole();
                UserRole userRole = new UserRole();

                adminRole.setPropertyId(KeyGenerator.generateId());
                adminRole.setRoleName("ADMIN");
                adminRole.setRoleDescription("Only for the Admin");

                userRole.setPropertyId(KeyGenerator.generateId());
                userRole.setRoleName("USER");
                userRole.setRoleDescription("Only for the User");

                //==================
                User systemUser = new User();
                systemUser.setPropertyId(KeyGenerator.generateId());
                systemUser.setUsername("hasikasandaruwan.info@gmail.com");
                systemUser.setPassword(PasswordGenerator.passwordGen(6));
                systemUser.setDisplayName("Hasika Sandaruwan");
                systemUser.setActiveState(true);
                systemUser.setUserRole(adminRole);

                session.save(adminRole);
                session.save(userRole);
                session.save(systemUser);

                transaction.commit();
            }

        }

    }

}
