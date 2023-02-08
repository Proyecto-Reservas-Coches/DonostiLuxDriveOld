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
    void goToCoches(ActionEvent event) throws IOException {
        CochesButtonNav.setOnAction(e -> InicioApplication.);
        VBox layout = new VBox(10);
        Stage window = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(InicioApplication.class.getResource("coches-view.xml"));
        Scene scene2 = new Scene(fxmlLoader.load());
        window.setTitle("Coches");
        window.setScene(scene2);
        window.show();
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
