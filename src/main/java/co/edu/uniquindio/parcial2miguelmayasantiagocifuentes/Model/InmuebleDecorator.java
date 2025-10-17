package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model;

public abstract class InmuebleDecorator implements InmuebleComponent {
    protected InmuebleComponent inmueble;

    public InmuebleDecorator(InmuebleComponent inmueble) {
        this.inmueble = inmueble;
    }

    @Override
    public String getTipo() {
        return inmueble.getTipo();
    }

    @Override
    public String getCiudad() {
        return inmueble.getCiudad();
    }

    @Override
    public String getNumHabitaciones() {
        return inmueble.getNumHabitaciones();
    }

    @Override
    public String getNumPisos() {
        return inmueble.getNumPisos();
    }

    @Override
    public double getPrecio() {
        return inmueble.getPrecio();
    }
}