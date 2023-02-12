package com.example.donostiluxdrive;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SegurosPopUpController {

    @FXML
    private Button cerrarSeguroButton;

    @FXML
    void goToReserva(ActionEvent event) {
        Stage stage = (Stage) cerrarSeguroButton.getScene().getWindow();
        stage.close();
    }

}
