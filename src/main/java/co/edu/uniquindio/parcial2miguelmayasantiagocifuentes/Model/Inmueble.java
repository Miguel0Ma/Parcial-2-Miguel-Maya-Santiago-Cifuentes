package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model;

public class Inmueble {
    private String tipo;
    private String ciudad;
    private String numHabitaciones;
    private  String numPisos;
    private double precio;


    private Inmueble(Builder builder) {
        this.tipo = builder.tipo;
        this.ciudad = builder.ciudad;
        this.numHabitaciones = builder.numHabitaciones;
        this.numPisos = builder.numPisos;
        this.precio = builder.precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(String numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(String numPisos) {
        this.numPisos = numPisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static class Builder {
        private String tipo;
        private String ciudad;
        private String numHabitaciones;
        private  String numPisos;
        private double precio;

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }
        public Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }
        public Builder numHabitaciones(String numHabitaciones) {
            this.numHabitaciones = numHabitaciones;
            return this;
        }
        public Builder numPisos(String numPisos) {
            this.numPisos = numPisos;
            return this;
        }
        public Builder precio(double precio) {
            this.precio = precio;
            return this;
        }
        public Inmueble build() {
            return new Inmueble(this);
        }

    }
}
