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
    void goToCoches() throws IOException {
        CochesButtonNav.setOnAction(event -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoCoche-view.fxml"));
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }




    @FXML
    void goToInicio(ActionEvent event) {

    }

    @FXML
    void goToSeguros(ActionEvent event) {

    }

    @FXML
    void goToSignIn(ActionEvent event) {

    }

}
