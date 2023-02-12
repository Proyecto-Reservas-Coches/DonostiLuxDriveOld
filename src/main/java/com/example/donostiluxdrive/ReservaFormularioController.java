package com.example.donostiluxdrive;

import clases.*;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReservaFormularioController implements Initializable{
    //Componentes GUI
    @FXML
    private ComboBox<CochePrueba> colorCombo;

    @FXML
    private Label disponiblelabel;

    @FXML
    private DatePicker fechaFin;

    @FXML
    private DatePicker fechaIn;

    @FXML
    private ComboBox<CochePrueba> marcaCombo;

    @FXML
    private Button masInfoComboButton;

    @FXML
    private ComboBox<CochePrueba> modeloCombo;

    @FXML
    private Label precioTotalLabel;

    @FXML
    private ComboBox<SeguroPrueba> seguroCombo;



    //Colecciones
    private ObservableList<CochePrueba> listaMarca;
    private ObservableList<CochePrueba> listaModelo;
    private ObservableList<CochePrueba> listaColor;
    private ObservableList<SeguroPrueba> listaSeguro;
    private boolean disponibilidad;
    private Conexion conexion;

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        conexion = new Conexion();
        conexion.establecerConexion();

        //Inicializar listas
        listaMarca = FXCollections.observableArrayList();
        listaModelo = FXCollections.observableArrayList();
        listaColor = FXCollections.observableArrayList();
        listaSeguro = FXCollections.observableArrayList();

        //Llenar listas
        //Carrera.llenarInformacion(conexion.getConnection(), listaCarreras);
        //CentroEstudio.llenarInformacion(conexion.getConnection(), listaCentrosEstudios);
        //Alumno.llenarInformacionAlumnos(conexion.getConnection(), listaAlumnos);
        //SeguroPrueba.llenarSeguro(conexion.getConnection(), listaSeguro);

        //Enlazar listas con ComboBox y TableView
        marcaCombo.setItems(listaMarca);
        modeloCombo.setItems(listaModelo);
        colorCombo.setItems(listaColor);
        seguroCombo.setItems(listaSeguro);

        //Llenar marca temporal
        listaMarca.add(new CochePrueba("Ferrari"));
        listaMarca.add(new CochePrueba("BUggatti"));
        listaMarca.add(new CochePrueba("Mercedez"));
        listaMarca.add(new CochePrueba("Rolls-Royce"));

        listaMarca.add(new CochePrueba("Ferrari"));
        listaMarca.add(new CochePrueba("BUggatti"));
        listaMarca.add(new CochePrueba("Mercedez"));
        listaMarca.add(new CochePrueba("Rolls-Royce"));


        //Llenar seguros temporal
        listaSeguro.add(new SeguroPrueba(1,"A Todo Riesgo",50));
        listaSeguro.add(new SeguroPrueba(1,"Elite",50));
        listaSeguro.add(new SeguroPrueba(1,"Estandar",50));
        /*
        //Llenar seguros temporal
        listaSeguro.add(new SeguroPrueba(1,"A Todo Riesgo",50));
        listaSeguro.add(new SeguroPrueba(1,"Elite",50));
        listaSeguro.add(new SeguroPrueba(1,"Estandar",50));

        //Llenar seguros temporal
        listaSeguro.add(new SeguroPrueba(1,"A Todo Riesgo",50));
        listaSeguro.add(new SeguroPrueba(1,"Elite",50));
        listaSeguro.add(new SeguroPrueba(1,"Estandar",50));
        */



        //Enlazar columnas con atributos
        //clmnNombre.setCellValueFactory(new PropertyValueFactory<Alumno,String>("nombre"));


    }
}
