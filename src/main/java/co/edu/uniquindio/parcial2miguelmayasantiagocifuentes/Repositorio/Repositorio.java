package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Repositorio;



import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.Factory;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.Inmueble;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.InmuebleComponent;

import java.util.ArrayList;

public class Repositorio {

    private static Repositorio instancia;
    private ArrayList<InmuebleComponent> inmuebles;

    private Repositorio() {
        inmuebles = new ArrayList<>();
        cargarDatosEjemplo();
    }

    public static Repositorio getInstancia() {
        if (instancia == null) {
            instancia = new Repositorio();
        }
        return instancia;
    }


    private void cargarDatosEjemplo() {
        Inmueble inmueble1= Factory.getInstance().crearInmueble("Armenia","Casa","2","1",100000);
        inmuebles.add(inmueble1);
    }

    public ArrayList<InmuebleComponent> getInmuebles() {
        return inmuebles;
    }

    public void agregarInmueble(InmuebleComponent inmueble) {
        inmuebles.add(inmueble);
    }

    public boolean eliminarInmueble(InmuebleComponent inmueble) {
        return inmuebles.remove(inmueble);
    }

}