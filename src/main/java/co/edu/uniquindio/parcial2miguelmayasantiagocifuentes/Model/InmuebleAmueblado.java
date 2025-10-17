package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model;

public class InmuebleAmueblado extends InmuebleDecorator {
    public InmuebleAmueblado(InmuebleComponent inmueble) {
        super(inmueble);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 30000;  // Aumenta precio por amueblado
    }

    @Override
    public String getTipo() {
        return super.getTipo() + " amueblado";
    }
}