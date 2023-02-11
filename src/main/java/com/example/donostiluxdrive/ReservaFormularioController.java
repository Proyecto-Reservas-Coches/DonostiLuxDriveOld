package com.example.donostiluxdrive;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReservaFormularioController /*implements Initializable*/ {
    //Declracion de variables del fxml

    @FXML
    private ComboBox<String> colorCombo;

    @FXML
    private Label disponiblelabel;

    @FXML
    private ComboBox<String> marcaCombo;

    @FXML
    private Button masInfoComboButton;

    @FXML
    private ComboBox<String> modeloCombo;

    @FXML
    private Label precioTotalLabel;

    @FXML
    private ComboBox<String> seguroCombo;

    private String[] seguros = {"A todo Riesgo", "Estandar", "Elite"};

    //Declaracion de varibles para los comboBox
    //private ObservableList<Seguro> listaSeguro;

    //Varibles para la conexion
    //private Conexion conexion;

    //Crear Conexion
        /*conexion = new Conexion();
		conexion.establecerConexion();*/
    //Abrir una ventana de Seguros PopUp

        @FXML
        void goToSegurosPopUp(ActionEvent event) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("SegurosPopUp-view.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    @FXML
    void listaColor(ActionEvent event) {

    }

    @FXML
    void listaMarca(ActionEvent event) {

    }

    @FXML
    void listaModelo(ActionEvent event) {

    }

    //@Override
    public void listaSeguro(/*URL location, ResourceBundle resources*/) {
            //seguroCombo.getItems().addAll(seguros);


        /*  seguroCombo.setItems(FXCollections.observableAr
         rayList("Estandar", "A Todo Reiesgo" , "Elite"));*/


    }

}
