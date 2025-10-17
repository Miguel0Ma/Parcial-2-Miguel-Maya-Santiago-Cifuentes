module co.edu.uniquindio.parcial2miguelmayasantiagocifuentes {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial2miguelmayasantiagocifuentes to javafx.fxml;
    opens co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Controladores to javafx.fxml;
    opens co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model to javafx.base;
    exports co.edu.uniquindio.parcial2miguelmayasantiagocifuentes;
    exports co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Controladores;
    exports co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model;
}