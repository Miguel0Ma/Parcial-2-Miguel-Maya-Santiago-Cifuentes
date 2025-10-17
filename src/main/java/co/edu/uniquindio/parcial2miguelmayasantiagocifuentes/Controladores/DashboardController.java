package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Controladores;

import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.InmuebleComponent;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Repositorio.Repositorio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class DashboardController {

    @FXML
    private Label lblTitulo;

    @FXML
    private TableView<InmuebleComponent> tablaInmuebles;

    @FXML
    private TableColumn<InmuebleComponent, String> colTipo;

    @FXML
    private TableColumn<InmuebleComponent, String> colCiudad;

    @FXML
    private TableColumn<InmuebleComponent, String> colNumHabitaciones;

    @FXML
    private TableColumn<InmuebleComponent, String> colNumPisos;

    @FXML
    private TableColumn<InmuebleComponent, Double> colPrecio;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnEliminar1;

    private Stage stage;
    private Repositorio repositorio = Repositorio.getInstancia();

    public void setStage(Stage stage) {
        this.stage = stage;
        cargarInmuebles();
    }

    @FXML
    public void initialize() {
        if (stage != null) {
            cargarInmuebles();
        }
    }

    private void cargarInmuebles() {
        ArrayList<InmuebleComponent> inmuebles = repositorio.getInmuebles();
        ObservableList<InmuebleComponent> observableInmuebles = FXCollections.observableArrayList(inmuebles);
        tablaInmuebles.setItems(observableInmuebles);

        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colNumHabitaciones.setCellValueFactory(new PropertyValueFactory<>("numHabitaciones"));
        colNumPisos.setCellValueFactory(new PropertyValueFactory<>("numPisos"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
    }

    @FXML
    protected void onRegresar() {
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
    protected void onEliminarInmueble() {
        InmuebleComponent selected = tablaInmuebles.getSelectionModel().getSelectedItem();
        if (selected != null) {
            repositorio.eliminarInmueble(selected);
            cargarInmuebles();
        }
    }

    public void refreshTable() {
        cargarInmuebles();
    }
}