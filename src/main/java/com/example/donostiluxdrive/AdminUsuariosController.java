package com.example.donostiluxdrive;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdminUsuariosController {

    @FXML
    private TableColumn<?, ?> apellidoColumn;

    @FXML
    private Label birthdayLabel;

    @FXML
    private Label cityLabel;

    @FXML
    private Label firstNameLabel;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private Label lastNameLabel;

    @FXML
    private TableColumn<?, ?> nombreColumn;

    @FXML
    private Label postalCodeLabel;

    @FXML
    private Label streetLabel;

    @FXML
    private TableView<?> usuarioTable;

    @FXML
    void handleDeletePerson(ActionEvent event) {

    }

    @FXML
    void handleEditPerson(ActionEvent event) {

    }

    @FXML
    void handleNewPerson(ActionEvent event) {

    }

}
