package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Controladores;

import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.Factory;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.InmuebleComponent;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.InmuebleConJardin;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.InmuebleAmueblado;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Repositorio.Repositorio;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FormularioController {

    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtNumHabitaciones;

    @FXML
    private TextField txtNumPisos;

    @FXML
    private TextField txtPrecio;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnGuardar;

    private Stage stage;
    private Repositorio repositorio = Repositorio.getInstancia();

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void onCancelar() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/parcial2miguelmayasantiagocifuentes/Menu.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            MenuController controller = fxmlLoader.getController();
            controller.setStage(stage);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onGuardarInmueble() {
        String tipo = txtTipo.getText();
        String ciudad = txtCiudad.getText();
        String numHabitaciones = txtNumHabitaciones.getText();
        String numPisos = txtNumPisos.getText();
        double precio = Double.parseDouble(txtPrecio.getText());

        InmuebleComponent inmueble = Factory.getInstance().crearInmueble(ciudad, tipo, numHabitaciones, numPisos, precio);

        // Aplicar decoradores si es necesario (ejemplo: si tipo contiene "jardin" o "amueblado")
        if (tipo.toLowerCase().contains("jardin")) {
            inmueble = new InmuebleConJardin(inmueble);
        }
        if (tipo.toLowerCase().contains("amueblado")) {
            inmueble = new InmuebleAmueblado(inmueble);
        }

        repositorio.agregarInmueble(inmueble);

        // Limpiar campos
        txtTipo.clear();
        txtCiudad.clear();
        txtNumHabitaciones.clear();
        txtNumPisos.clear();
        txtPrecio.clear();

        // Regresar al menú
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
}