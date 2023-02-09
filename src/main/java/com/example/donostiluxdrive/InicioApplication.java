package com.example.donostiluxdrive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioApplication extends Application {
    private Stage infoCochesStage; 

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InicioApplication.class.getResource("Inicio-view.fxml"));
        Scene sceneInico = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Inicio");
        primaryStage.setScene(sceneInico);
        primaryStage.show();

        infoCochesStage = new Stage();
        infoCoche(infoCochesStage);
    }

    public void infoCoche(Stage infoCochesStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InicioApplication.class.getResource("InfoCoche-view.fxml"));
        Scene sceneCoche = new Scene(fxmlLoader.load());
        infoCochesStage.setTitle("Coches");
        infoCochesStage.setScene(sceneCoche);
    }

    public void switchToInfoCoche() {
        infoCochesStage.show();
    }

    public void switchToInicio() {
        infoCochesStage.hide();
    }



    public static void main(String[] args) {
        launch();
    }
}