package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes;

import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Controladores.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        MenuController controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setTitle("Dashboard de Inmuebles");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
