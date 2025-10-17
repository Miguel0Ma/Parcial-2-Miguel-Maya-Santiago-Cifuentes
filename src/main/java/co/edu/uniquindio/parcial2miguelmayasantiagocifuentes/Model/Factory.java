package co.edu.uniquindio.parcial2miguelmayasantiagocifuentes.Model;

public class Factory {
    private static Factory instance;

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }return instance;
    }

    public static Inmueble crearInmueble(String ciudad,String tipo,String numhabitaciones,String numpisos,double precio){
        Inmueble.Builder builder = new Inmueble.Builder();
        switch(tipo.toLowerCase()){
            case "casa":
                builder.tipo("casa").ciudad(ciudad).numHabitaciones(numhabitaciones).numPisos(numpisos).precio(precio);
            break;

            case "apartamento":
                builder.tipo("apartamento").ciudad(ciudad).numHabitaciones(numhabitaciones).numPisos(numpisos).precio(precio);
            break;

            case "finca":
                builder.tipo("finca").ciudad(ciudad).numHabitaciones(numhabitaciones).numPisos(numpisos).precio(precio);;
            break;

            case"local":
                builder.tipo("local").ciudad(ciudad).numHabitaciones(numhabitaciones).numPisos(numpisos).precio(precio);;
            break;
            default:
                builder.tipo(tipo).ciudad(ciudad).numHabitaciones(numhabitaciones).numPisos(numpisos).precio(precio);;
        }
        return builder.build();
    }
}
