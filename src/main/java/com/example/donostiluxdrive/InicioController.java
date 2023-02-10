package com.example.donostiluxdrive;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioController {
    private Stage stage;


    @FXML
    private Button CochesButton;

    @FXML
    private Button CochesButtonNav;

    @FXML
    private Button InicioButtonNav;

    @FXML
    private Button SegurosButtonNav;

    @FXML
    private Button SignInButton;

    @FXML
    void goToCoches()   {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Coches-view.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) CochesButtonNav.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void goToInicio(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Inicio-view.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) InicioButtonNav.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Coches-view.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) CochesButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void goToSeguros(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Seguros-view.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) SegurosButtonNav.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void goToSignIn(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginSignup-view.fxml"));
            Scene scene = new Scene(root);
            stage = (Stage) SignInButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
