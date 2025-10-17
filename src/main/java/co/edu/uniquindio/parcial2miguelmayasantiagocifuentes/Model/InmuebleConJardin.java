package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model;

public class InmuebleConJardin extends InmuebleDecorator {
    public InmuebleConJardin(InmuebleComponent inmueble) {
        super(inmueble);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 50000;
    }

    @Override
    public String getTipo() {
        return super.getTipo() + " con jardín";
    }
}