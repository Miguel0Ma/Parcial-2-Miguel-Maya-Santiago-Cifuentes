package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button btnInfo;

    @FXML
    private Button btnCrearProducto;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void onInfo() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parcial2miguelmayasantiagocifuentes/Dashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            DashboardController controller = fxmlLoader.getController();
            controller.setStage(stage);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onCrearProducto() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parcial2miguelmayasantiagocifuentes/Formulario.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            FormularioController controller = fxmlLoader.getController();
            controller.setStage(stage);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}