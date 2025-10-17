package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Repositorio;



import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.Factory;
import co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model.Inmueble;

import java.util.ArrayList;

public class Repositorio {

    private static Repositorio instancia;
    private ArrayList<Inmueble> inmuebles;

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

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }

    public boolean eliminarInmueble(Inmueble inmueble) {
        return inmuebles.remove(inmueble);
    }

    public Inmueble buscarPorCiudad(String ciudad) {
        return inmuebles.stream()
                .filter(p -> p.getCiudad().equals(ciudad))
                .findFirst()
                .orElse(null);
    }

    public int getCantidadInmuebles() {
        return inmuebles.size();
    }
}